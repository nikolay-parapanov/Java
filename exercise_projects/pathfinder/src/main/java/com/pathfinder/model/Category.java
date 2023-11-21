package com.pathfinder.model;

import com.pathfinder.model.enums.RouteCategory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    @Enumerated(EnumType.STRING)
    private RouteCategory name;

    @Column(columnDefinition = "TEXT")
    private String description;

    public Category (){}



}
