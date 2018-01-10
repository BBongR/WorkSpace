package com.example.administrator.multitypelistview.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ModelMovie {

    private Drawable imagePicture;
    private String   textTitle;
    private String   textYear;

    public ModelMovie() {
    }

    public ModelMovie(Drawable image_picture, String text_title, String text_year) {
        this.imagePicture = image_picture;
        this.textTitle = text_title;
        this.textYear = text_year;
    }

    public Drawable getImagePicture() {
        return imagePicture;
    }

    public void setImagePicture(Drawable imagePicture) {
        this.imagePicture = imagePicture;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle;
    }

    public String getTextYear() {
        return textYear;
    }

    public void setTextYear(String textYear) {
        this.textYear = textYear;
    }

    @Override
    public String toString() {
        return "ModelMovie{" +
                "imagePicture=" + imagePicture +
                ", textTitle='" + textTitle + '\'' +
                ", textYear='" + textYear + '\'' +
                '}';
    }
}
