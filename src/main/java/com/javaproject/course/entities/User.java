package com.javaproject.course.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {

    private long id;
    private String name;
    private String Email;
    private String phone;
    private String Password;

    public User() {
    }

    public User(long id, String name, String email, String phone, String password) {
        this.id = id;
        this.name = name;
        Email = email;
        this.phone = phone;
        Password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
