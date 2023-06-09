package P06_Animals;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private String asString;
    Gender(String asString) {
        this.asString = asString;
    }

    public String getAsString() {
        return asString;
    }
}
