package com.mapsa.bta.model;

public class userDto {
    private int id ;
    private String name ;
    private String family ;
    private String password ;
    private String email ;
    private long phoneNumber ;



    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
