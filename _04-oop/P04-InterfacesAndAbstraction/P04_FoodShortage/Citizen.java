package P04_FoodShortage;

public class Citizen implements Person, Identifiable, Birthable, Buyer {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthDate = birthDate;
        this.food = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getbirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.getId();
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public void buyFood(){
         this.food += 10;
    }

}
