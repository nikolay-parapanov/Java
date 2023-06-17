package JUG_Academy.OOP;

public class _03Animal {
    public static void main(String[] args) {

    }

    abstract static class Animal {

        public void makeSound(){

        }

    }

    public static class Dog extends Animal{
        @Override
        public void makeSound() {
            System.out.println("bark");;
        }
    }
    public static class Cat extends Animal{
        @Override
        public void makeSound() {
            System.out.println("myau");;
        }
    }
}
