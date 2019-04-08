package com.oanhk.MyContact.entity;

import javax.persistence.*;

@Entity
@Table(name="contact")
public class contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id", nullable = false)
    private Integer id;

    @Column(name="name",nullable = false)
    private  String name;

    @Column(name="email",nullable = false)
    private  String email;

    @Column(name = "phone",nullable = false)
    private  String phone;

    public contact() {
    }

    public contact(Integer id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
