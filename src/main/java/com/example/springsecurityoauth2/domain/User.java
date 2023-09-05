package com.example.springsecurityoauth2.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "codemylove_users")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Uid;
    private String firstName;
    private String lastName;
    private Boolean activated;
    private String email;
    private String langKey;
    private String imageUrl;
}
