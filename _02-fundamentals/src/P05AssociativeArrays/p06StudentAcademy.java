package P05AssociativeArrays;

import java.util.*;

public class p06StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrade = new LinkedHashMap<>();

        for (int i = 0; i < countStudents; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            if (!studentGrade.containsKey(name)) {
                studentGrade.put(name, new ArrayList<>());
            }
            studentGrade.get(name).add(grade);
        }

        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);
            if (averageGrade >= 4.5){
                averageGradeStudents.put(studentName, averageGrade);
            }
        }

        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));

    }

    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade : listGrades) {
            sumGrades += grade;
        }
        return sumGrades/ listGrades.size();
    }
}

