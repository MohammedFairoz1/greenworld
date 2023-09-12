package com.greenworld.userService.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "micro_user")
public class User {
    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;
    private String about;

    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
