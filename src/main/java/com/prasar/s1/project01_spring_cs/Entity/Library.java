package com.prasar.s1.project01_spring_cs.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "Book_name")
    @NotBlank(message = "book name cant be null")
//    @NotNull(message = "should not ber epty")
    private String name;

@Size(max = 10, min = 3 ,message = "should be in 3 to 10")
    private String writter;


    private String publication;


    private Boolean availability;
}
