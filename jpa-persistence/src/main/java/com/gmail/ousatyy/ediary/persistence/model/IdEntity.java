package com.gmail.ousatyy.ediary.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.AttributeAccessor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by ousatyi on 4/21/2017.
 */
@MappedSuperclass
@AttributeAccessor("field")
@ToString
public class IdEntity implements Serializable{
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id", unique = true, columnDefinition="char(32)")
    @Getter
    @Setter
    protected String id;
}
