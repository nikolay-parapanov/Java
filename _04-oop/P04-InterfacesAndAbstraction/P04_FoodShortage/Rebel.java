package P04_FoodShortage;

public class Rebel implements Person, Buyer {

    //name:String
//        age:int
//        group:String
//        food:int
//        Rebel(String,int,String)
//        getName():String
//        getAge():int
//        getGroup():String
//        getFood():int
//        buyFood():void

    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.food = 0;
    }


    @Override
    public void buyFood() {
        this.food += 5;
    }

    @Override
    public int getFood() {
        return this.food;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;

    }

    public String getGroup() {
        return this.group;
    }
}
