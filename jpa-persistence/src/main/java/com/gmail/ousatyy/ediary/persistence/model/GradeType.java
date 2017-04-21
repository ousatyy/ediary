package com.gmail.ousatyy.ediary.persistence.model;

/**
 * Created by ousatyi on 4/21/2017.
 */
public enum GradeType {
    REGULAR, SEMI, FINAL;

    public static final class Constants {
        public static final String ENUM_VALUES = "ENUM('REGULAR', 'SEMI', 'FINAL')";
    }
}
