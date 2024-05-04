package com.userservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="micro_users")
public class User {
    @Id
    private int userid;
    private String name;
    private String Email;
    private String about;
    @Transient
    private List<Ratings> ratings;
}
