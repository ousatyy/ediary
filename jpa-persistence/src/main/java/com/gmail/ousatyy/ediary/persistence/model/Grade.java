package com.gmail.ousatyy.ediary.persistence.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ousatyi on 4/21/2017.
 */
@Entity
@Table(name = "grade")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Grade extends BaseEntity{
    @Getter
    @Setter
    private Teacher owner;

    @Getter
    @Setter
    private Student student;

    @Getter
    @Setter
    private Subject subject;

    @Getter
    @Setter
    private int value;

    @Getter
    @Setter
    private int weight;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, columnDefinition = GradeType.Constants.ENUM_VALUES)
    @Getter
    @Setter
    private GradeType type;

    @Getter
    @Setter
    private String comment;
}
