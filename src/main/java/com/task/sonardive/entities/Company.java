package com.task.sonardive.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Company {
    @Id
    private int id;
    private String name;
    @ManyToOne
    private Country country;

    public Company() {}

    public Company(int id, String name, Country country) {
        this.id = id;
        this.name = name;

        this.country = country;
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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}