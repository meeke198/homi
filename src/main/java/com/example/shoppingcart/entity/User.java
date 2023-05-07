package com.example.shoppingcart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    @NotBlank
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    @NotBlank
    @Column(name = "password", length = 255, nullable = false)
    private String password;
    @Column(name = "session_token", length = 255, nullable = true)
    private String sessionToken;
    @Column(name = "avatar", length = 50, nullable = false)
    private String avatar;
    @Column(name = "status", nullable = true)
    private Boolean isActive;

}
