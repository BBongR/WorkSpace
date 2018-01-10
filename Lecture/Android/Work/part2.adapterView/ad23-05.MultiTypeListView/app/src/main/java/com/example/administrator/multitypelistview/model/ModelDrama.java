package com.example.administrator.multitypelistview.model;

import android.graphics.drawable.Drawable;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ModelDrama {

    private Drawable imagePicture;
    private String   textTitle;
    private String   textInterval;

    public ModelDrama() {
    }

    public ModelDrama(Drawable image_picture, String text_title, String text_interval) {
        this.imagePicture = image_picture;
        this.textTitle = text_title;
        this.textInterval = text_interval;
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

    public String getTextInterval() {
        return textInterval;
    }

    public void setTextInterval(String textInterval) {
        this.textInterval = textInterval;
    }

    @Override
    public String toString() {
        return "ModelDrama{" +
                "imagePicture=" + imagePicture +
                ", textTitle='" + textTitle + '\'' +
                ", textInterval='" + textInterval + '\'' +
                '}';
    }
}
