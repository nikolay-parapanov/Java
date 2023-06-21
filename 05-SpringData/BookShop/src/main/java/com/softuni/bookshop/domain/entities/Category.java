package com.softuni.bookshop.domain.entities;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Category extends BaseEntity {
    @Column(nullable = false)
    private String name;

}
