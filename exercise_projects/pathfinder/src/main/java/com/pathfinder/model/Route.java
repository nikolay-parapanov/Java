package com.pathfinder.model;
import com.pathfinder.model.enums.Level;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String gpxCoordinates;

    @Enumerated(EnumType.STRING)
    private Level level;

    private String name;

    @ManyToOne
    private User author;

    private String videoUrl;

    @OneToMany(targetEntity = Comment.class, mappedBy = "route", cascade = CascadeType.ALL)
    private Set<Comment> comments;

    @OneToOne
    private Picture header;

    @ManyToMany
    private Set<Category> categories;

    public Route() {
        this.comments = new HashSet<>();
    }


}
