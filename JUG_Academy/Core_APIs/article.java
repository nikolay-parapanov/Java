package JUG_Academy.Core_APIs;

public class article {
    public static void main(String[] args) {
        String test4 = getArticle("invalid132###!!!");
        System.out.println(test4.contains("Some content"));

    }

    public static String getArticle(String title) {
        StringBuilder result = new StringBuilder();
        java.net.HttpURLConnection connection = null;
        java.io.BufferedReader reader = null;

        try {
            java.net.URL url = new java.net.URL("https://en.wikipedia.org/api/rest_v1/page/html/" + title);
            connection = (java.net.HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            reader = new java.io.BufferedReader(new java.io.InputStreamReader(connection.getInputStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
            if (connection != null) {
                connection.disconnect();
            }
        }

        return result.toString();
    }
}
