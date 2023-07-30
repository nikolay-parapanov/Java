package JUG_Academy.Core_APIs;

public class InstanceFieldCounter {

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        int numberOfFields = numberOfInstanceFields(example);
        System.out.println("Number of instance fields: " + numberOfFields);
    }

    public static int numberOfInstanceFields(Object object) {
        java.util.Set<String> fieldNames = new java.util.HashSet<>();
        Class<?> currentClass = object.getClass();

        while (currentClass != null) {
            for (java.lang.reflect.Field field : currentClass.getDeclaredFields()) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    fieldNames.add(field.getName());
                }
            }
            currentClass = currentClass.getSuperclass();
        }

        return fieldNames.size();
    }

    // Example class to test the method
    static class ExampleClass {
        private int age;
        private String name;
        protected double salary;
        public char gender;
    }
}
