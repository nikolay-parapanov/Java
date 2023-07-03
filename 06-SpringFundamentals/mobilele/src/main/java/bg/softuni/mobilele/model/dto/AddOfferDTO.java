package bg.softuni.mobilele.model.dto;

import bg.softuni.mobilele.model.enums.EngineEnum;
import bg.softuni.mobilele.model.enums.TransmissionEnum;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class AddOfferDTO {
    @NotNull
    @Min(1)
    private Long modelId;
    @NotNull
    private EngineEnum engine;
    @NotNull
    @Positive
    private Integer price;
    @Min(1900)
    @NotNull
    private Integer year;
@NotEmpty
    private String description;
    @NotNull
    private TransmissionEnum transmission;


    @NotEmpty
    private String imageUrl;

    public AddOfferDTO() {
    }

    public AddOfferDTO(EngineEnum engine) {
        this.engine = engine;
    }

    public AddOfferDTO setEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    public EngineEnum getEngine() {
        return engine;
    }

    public TransmissionEnum getTransmission() {
        return transmission;
    }

    public AddOfferDTO setTransmission(TransmissionEnum transmission) {
        this.transmission = transmission;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public AddOfferDTO setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Long getModelId() {
        return modelId;
    }

    public AddOfferDTO setModelId(Long modelId) {
        this.modelId = modelId;
        return this;
    }
}
