package entities;

import orm.annotations.Column;
import orm.annotations.Entity;
import orm.annotations.Id;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.time.LocalDate;

@Entity(name = "users")
public class User {
    @Id
    private long id;
    @Column(name = "user_name")
    private String username;
    @Column(name = "age")
    private int age;
    @Column(name = "registration_date")
    private LocalDate registration;

    public User(String username, int age, LocalDate registration) {
        this.username = username;
        this.age = age;
        this.registration = registration;
    }

    public User(){}

    public String getUsername() {
        return username;
    }

    public long getId() {
        return id;
    }
}
