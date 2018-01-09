package com.example.administrator.multitypelistview;

import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ModelActor {

    private Drawable imagePhoto;
    private String   textName;
    private String   textAge;
    private String   textDescription;

    public ModelActor() {
    }

    public ModelActor(Drawable image_photo, String text_name, String text_age, String text_description) {
        this.imagePhoto = image_photo;
        this.textName = text_name;
        this.textAge = text_age;
        this.textDescription = text_description;
    }

    public Drawable getImagePhoto() {
        return imagePhoto;
    }

    public void setImagePhoto(Drawable imagePhoto) {
        this.imagePhoto = imagePhoto;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public String getTextAge() {
        return textAge;
    }

    public void setTextAge(String textAge) {
        this.textAge = textAge;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    @Override
    public String toString() {
        return "ModelActor{" +
                "imagePhoto=" + imagePhoto +
                ", textName='" + textName + '\'' +
                ", textAge='" + textAge + '\'' +
                ", textDescription='" + textDescription + '\'' +
                '}';
    }
}
