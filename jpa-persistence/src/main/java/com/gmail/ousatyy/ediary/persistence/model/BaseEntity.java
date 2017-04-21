package com.gmail.ousatyy.ediary.persistence.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.AttributeAccessor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.sql.Timestamp;

/**
 * Created by ousatyi on 4/21/2017.
 */
@MappedSuperclass
@AttributeAccessor("field")
@ToString
public class BaseEntity extends IdEntity{
    @Column(name = "created_date", nullable = false)
    @Getter
    @Setter
    protected Timestamp createdDate;

    @Column(name = "modified_date", nullable = false)
    @Getter
    @Setter
    protected Timestamp modifiedDate;

    @PrePersist
    protected void onCreate() {
        createdDate = new Timestamp(System.currentTimeMillis());
        modifiedDate = new Timestamp(System.currentTimeMillis());
    }

    @PreUpdate
    protected void onUpdate() {
        modifiedDate = new Timestamp(System.currentTimeMillis());
        if (createdDate == null) {
            createdDate = new Timestamp(System.currentTimeMillis());
        }
    }
}
