package bg.softuni.mobilele.model.dto;

import bg.softuni.mobilele.model.enums.EngineEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class AddOfferDTO {
    @NotNull
    private EngineEnum engine;

    @NotEmpty
    private String imageUrl;

    public AddOfferDTO() {
    }

    public AddOfferDTO(EngineEnum engine) {
        this.engine = engine;
    }

    public AddOfferDTO setEngine(EngineEnum engine){
        this.engine = engine;
        return this;
    }
}
