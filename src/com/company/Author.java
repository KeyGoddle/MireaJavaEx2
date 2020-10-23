package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String n, String e, char g){
        name = n;
        email = e;
        gender = g;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "Author's name is "+this.name+", his gender is "+this.gender+" and email - "+this.email;
    }
}
