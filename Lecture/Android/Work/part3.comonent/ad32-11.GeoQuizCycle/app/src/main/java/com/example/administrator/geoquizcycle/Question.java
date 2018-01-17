package com.example.administrator.geoquizcycle;

/**
 * Created by Administrator on 2018-01-17.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question() {
    }

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
