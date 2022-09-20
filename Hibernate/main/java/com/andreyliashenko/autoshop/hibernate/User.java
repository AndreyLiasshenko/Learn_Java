package com.andreyliashenko.autoshop.hibernate;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String lastname;

    @Column(name = "description")
    private String description;

    @OneToOne
    @JoinColumn(name = "details_id")
    private UsersDetails details;


    public User() {    }

    public User(String first_name, String lastname, String description) {
        this.first_name = first_name;
        this.lastname = lastname;
        this.description = description;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UsersDetails getDetails() {
        return details;
    }

    public void setDetails(UsersDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: "+ first_name + ", LastName: "+ lastname;
    }


}
