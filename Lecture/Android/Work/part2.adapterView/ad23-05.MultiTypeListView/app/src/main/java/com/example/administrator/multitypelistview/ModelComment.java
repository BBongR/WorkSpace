package com.example.administrator.multitypelistview;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ModelComment {

    private String textMessage;
    private String textWriter;

    public ModelComment() {
    }

    public ModelComment(String text_message, String text_writer) {
        this.textMessage = text_message;
        this.textWriter = text_writer;
    }

    public String getTextMessage() {
        return textMessage;
    }

    public void setTextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getTextWriter() {
        return textWriter;
    }

    public void setTextWriter(String textWriter) {
        this.textWriter = textWriter;
    }

    @Override
    public String toString() {
        return "ModelComment{" +
                "textMessage='" + textMessage + '\'' +
                ", textWriter='" + textWriter + '\'' +
                '}';
    }
}
