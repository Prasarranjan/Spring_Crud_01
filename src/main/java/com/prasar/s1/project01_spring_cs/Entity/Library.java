package com.prasar.s1.project01_spring_cs.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="lib")
public class Library {

    @Id
    @GeneratedValue()
    private int id;

    @Column(name = "Book_name")
    private String name;


    private String writter;


    private String publication;


    private Boolean availability;
}
