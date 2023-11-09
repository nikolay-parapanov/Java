package bg.exercise.mobilele.model.entity;

import bg.exercise.mobilele.model.entity.enums.UserRoleEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_roles")
@Getter
@Setter
public class UserRoleEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRoleEnum userRoles;


    @Override
    public String toString() {
        return "UserRoleEntity{" +
                "id=" + id +
                ", userRoles=" + userRoles +
                '}';
    }
}
