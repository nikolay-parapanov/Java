package JUG_Academy.Core_APIs;

public class MethodInvoker {
    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();

        // Method present in the class
        invokeDefault(example, "existingMethod");

        // Method missing in the class, but defaultMethod() is available
        invokeDefault(example, "missingMethod");

        // Method missing in the class, defaultMethod() also missing
        invokeDefault(example, "anotherMissingMethod");
    }

    public static void invokeDefault(Object object, String method) {
        Class<?> objClass = object.getClass();
        try {
            java.lang.reflect.Method targetMethod = objClass.getMethod(method);
            targetMethod.invoke(object);
        } catch (NoSuchMethodException e) {
            // Method not found, check for defaultMethod()
            try {
                java.lang.reflect.Method defaultMethod = objClass.getMethod("defaultMethod");
                defaultMethod.invoke(object);
            } catch (NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException ex) {
                // Ignore the execution if neither method is found
                System.out.println("Method '" + method + "' not found, defaultMethod() also not found. Ignoring.");
            }
        } catch (IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    // Example class to test the method
    static class ExampleClass {
        public void existingMethod() {
            System.out.println("Executing existingMethod()");
        }

        public void defaultMethod() {
            System.out.println("Executing defaultMethod()");
        }
    }
}