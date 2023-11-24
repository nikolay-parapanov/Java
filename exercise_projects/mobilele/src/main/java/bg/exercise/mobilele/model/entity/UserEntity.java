package bg.exercise.mobilele.model.entity;

import jakarta.persistence.*;
import jdk.dynalink.linker.LinkerServices;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
    @Column(unique = true)
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String imageUrl;
    private boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<UserRoleEntity> userRoles = new ArrayList<>();

    public UserEntity addRole(UserRoleEntity userRole) {
        this.userRoles.add(userRole);
        return this;
    }
}

