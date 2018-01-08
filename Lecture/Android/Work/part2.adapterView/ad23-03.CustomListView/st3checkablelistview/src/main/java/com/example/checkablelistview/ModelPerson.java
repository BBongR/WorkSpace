package com.example.checkablelistview;

import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2018-01-05.
 */

public class ModelPerson {

    private int      position;
    private String   name;
    private int      age;
    private Drawable photo;
    private boolean  check;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Drawable getPhoto() {
        return photo;
    }

    public void setPhoto(Drawable photo) {
        this.photo = photo;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    @Override
    public String toString() {
        return "ModelPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", photo=" + photo +
                ", check=" + check +
                '}';
    }

    public ModelPerson() {
    }

    public ModelPerson(String name, int age, Drawable photo, boolean check) {
        this.name = name;
        this.age = age;
        this.photo = photo;
        this.check = check;
    }
}
