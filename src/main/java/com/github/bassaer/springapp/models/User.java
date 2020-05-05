package com.github.bassaer.springapp.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private String email;
}
