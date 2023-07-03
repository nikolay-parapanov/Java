package bg.softuni.mobilele.model.dto;

import org.springframework.boot.Banner;

import java.util.ArrayList;
import java.util.List;

public class BrandDTO {
    private String name;
    private List<ModelDTO> models;

    public BrandDTO() {
    }

    public List<ModelDTO> getModels() {
        return models;
    }

    public BrandDTO setModels(List<ModelDTO> models) {
        this.models = models;
        return this;
    }
    public BrandDTO addModel(ModelDTO model) {
        if (this.models == null)    {
            this.models = new ArrayList<>();
        }
        this.models.add(model);
        return this;
    }

    public String getName() {
        return name;
    }

    public BrandDTO setName(String name) {
        this.name = name;
        return this;
    }
}
