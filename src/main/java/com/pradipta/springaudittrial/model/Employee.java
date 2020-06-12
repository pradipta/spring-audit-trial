package com.pradipta.springaudittrial.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@EntityListeners({AuditingEntityListener.class})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String dept;
    private Double salary;

    @CreatedDate
    private Long createdOn;
    @LastModifiedDate
    private Long modifiedOn;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String modifiedBy;
}
