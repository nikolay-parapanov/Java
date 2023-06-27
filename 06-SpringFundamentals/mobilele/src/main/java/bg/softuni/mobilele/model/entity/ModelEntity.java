package bg.softuni.mobilele.model.entity;

import bg.softuni.mobilele.model.entity.enums.CategoryEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private CategoryEnum categoryEnum;

    private String imageUrl;

    private int startYear;
    private Long endYear;

    @ManyToOne
    private BrandEntity brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryEnum getCategoryEnum() {
        return categoryEnum;
    }

    public void setCategoryEnum(CategoryEnum categoryEnum) {
        this.categoryEnum = categoryEnum;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public Long getEndYear() {
        return endYear;
    }

    public void setEndYear(Long endYear) {
        this.endYear = endYear;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "ModelEntity{" +
                "name='" + name + '\'' +
                ", categoryEnum=" + categoryEnum +
                ", imageUrl='" + imageUrl + '\'' +
                ", startYear=" + startYear +
                ", endYear=" + endYear +
                ", brand=" + (brand!=null ? brand.getName() : null) +
                '}';
    }
}
