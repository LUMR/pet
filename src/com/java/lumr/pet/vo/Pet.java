package com.java.lumr.pet.vo;

import java.util.Date;

/**
 * Created by fsweb on 17-3-24.
 */
public class Pet {
    private int id;
    private String name;
    private String breed;
    private String sex;
    private Date brithday;
    private String description;

    public Pet() {
        brithday = new Date();
    }

    public Pet(int id, String name, String breed, String sex, Date brithday, String description) {
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.sex = sex;
        this.brithday = brithday;
        this.description = description;
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
