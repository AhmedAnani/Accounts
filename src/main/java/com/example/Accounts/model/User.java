package com.example.Accounts.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends Auditlog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false,length = 30)
    private String name;


    @Column(unique = true ,length = 40)
    private String email;

    @Column(unique = true,length = 11)
    private String phone;

    @OneToOne(mappedBy = "user")
    private Account account;
}
