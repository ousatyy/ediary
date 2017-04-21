package com.gmail.ousatyy.ediary.persistence.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by ousatyi on 4/21/2017.
 */
@Entity
@Table(name = "student")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Setter
    @Getter
    private String firstName;
    @Setter
    @Getter
    private String lastName;
}
