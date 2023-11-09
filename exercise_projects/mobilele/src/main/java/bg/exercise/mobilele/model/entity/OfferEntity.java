package bg.exercise.mobilele.model.entity;

import bg.exercise.mobilele.model.entity.enums.EngineEnum;
import bg.exercise.mobilele.model.entity.enums.TransmissionEnum;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.query.sql.internal.ParameterRecognizerImpl;

import java.math.BigDecimal;
import java.util.UUID;


@Entity
@Table(name = "offers")
@Getter
@Setter
public class OfferEntity extends BaseEntity{

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EngineEnum engine;
    private String imageUrl;
    private int mileage;
    @Column(nullable = false)
    private BigDecimal price;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TransmissionEnum transmission;

    private int year;

    @ManyToOne
    private ModelEntity model;
    @ManyToOne
    private UserEntity seller;

    @Column(nullable = false)
    private String descripton;

    @Override
    public String toString() {
        return "OfferEntity{" +
                "engine=" + engine +
                ", imageUrl='" + imageUrl + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                ", transmission=" + transmission +
                ", year=" + year +
                ", model=" + model +
                ", seller=" + seller +
                ", descripton='" + descripton + '\'' +
                '}';
    }
}
