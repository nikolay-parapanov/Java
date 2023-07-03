package bg.softuni.mobilele.model.dto;

public class ModelDTO {
    private Long Id;
    private String name;

    public Long getId() {
        return Id;
    }

    public ModelDTO setId(Long id) {
        Id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ModelDTO setName(String name) {
        this.name = name;
        return this;
    }
}
