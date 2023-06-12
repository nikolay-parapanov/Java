package P03_BirthdayCelebration;


public class Pet implements Animal, Birthable {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }


    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
