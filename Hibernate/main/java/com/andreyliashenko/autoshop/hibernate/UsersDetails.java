package com.andreyliashenko.autoshop.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "users_details")
public class UsersDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "email")
    private String email;

    @Column(name = "city")
    private String city;

    @OneToOne(mappedBy = "details")

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UsersDetails() {    }

    public UsersDetails(String email, String city) {
        this.email = email;
        this.city = city;
    }

    @Override
    public String toString() {
        return "email: " + email + ", City: "+ city;
    }


}