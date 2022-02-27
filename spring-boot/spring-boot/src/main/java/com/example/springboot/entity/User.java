package com.example.springboot.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String loginId;
    @Column
    private String password;
    @Column
    private String temporyPassword;
}
