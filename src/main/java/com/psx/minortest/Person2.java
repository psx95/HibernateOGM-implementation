/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psx.minortest;

/**
 *
 * @author Pranav
 */
public class Person2 {
    long id;
    String title;
    String name;
    String email;
    String birthdate;
    String country;
    long phonenumber;
    
    // getters
    
    public long getId(){
        return id;
    }
    public String getTitle (){
        return title;
    }
    public String getName ()
    {
        return name;
    }
    public String getEmail ()
    {
        return email;
    }
    public String getBirthdate(){
        return birthdate;
    }
    
    public String getCountry(){
        return country;       
    }
    public long getPhonenumber (){
        return phonenumber;
    }
    
    // setters 
    
    public void setId (long id){
        this.id = id;
    }
    public void setTitle (String title){
        this.title = title;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setBirthdate (String birthdate){
        this.birthdate = birthdate;
    }
    public void setCountry (String country){
        this.country = country;
    }
    public void setPhonenumber (long phonenumber){
        this.phonenumber = phonenumber;
    }    
}
