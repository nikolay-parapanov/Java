package com.pathfinder.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean approved;

    private LocalDateTime created;

    @Lob
    private String text;

    @ManyToOne
    private User author;

    @ManyToOne
    private Route route;

    public Comment() {}
}
