package bg.softuni.mobilele.model.entity;

import bg.softuni.mobilele.model.entity.enums.CategoryEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {
    private String name;

    @Enumerated(EnumType.ORDINAL)
    private CategoryEnum categoryEnum;

    private String imageUrl;

    private int startYear;
    private Long endYear;


}
