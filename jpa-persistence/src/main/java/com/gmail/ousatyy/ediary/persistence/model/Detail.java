package com.gmail.ousatyy.ediary.persistence.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by ousatyi on 4/21/2017.
 */
@Entity
@Table(name = "detail")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Detail extends BaseEntity{

}
