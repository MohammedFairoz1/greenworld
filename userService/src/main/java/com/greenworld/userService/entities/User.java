package com.greenworld.userService.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "micro_users")
public class User {
    @Id
    @Column(name = "ID")
    private int userId;
    @Column(name = "NAME",length = 20)
    private String name;
    private String email;
}
