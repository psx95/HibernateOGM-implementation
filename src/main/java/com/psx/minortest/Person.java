/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psx.minortest;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.TableGenerator;

/**
 *
 * @author Pranav
 */
@Entity
public class Person implements Serializable {
    private Long id;
    private String name;
    private String title;
    private String email;
    private String birthdate;
    private String country;
    private long number;
    
@Id @GeneratedValue(strategy  = GenerationType.TABLE, generator = "person")
@TableGenerator(
        name="person",
        table="sequences",
        pkColumnName="key",
        pkColumnValue="person",
        valueColumnName="seed"
    )
    public Long getId() {
    return id;
    }
    public void setId (Long id){
        this.id = id;
    }
    public String getName (){
        return name;
    }
    public void setName (String name ){
        this.name = name;
    }
    public String getTitle (){
        return title;
    }
    public void setTitle (String title){
        this.title = title;
    }
    public String getEmail (){
        return email;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public String getCountry (){
        return country;
    }
    public void setCountry (String country){
        this.country = country;
    }
    public String getBirthdate (){
        return birthdate;
    }
    public void setBirthdate (String birthdate){
        this.birthdate = birthdate;
    }
    public long getNumber (){
        return number;
    }
    public void setNumber (long number){
        this.number = number;
    }
}
