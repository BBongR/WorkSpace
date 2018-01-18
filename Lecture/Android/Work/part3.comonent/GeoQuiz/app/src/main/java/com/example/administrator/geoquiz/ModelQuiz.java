package com.example.administrator.geoquiz;

/**
 * Created by Administrator on 2018-01-18.
 */

public class ModelQuiz {

    private String  mQuiz;
    private boolean mAnswer;

    public ModelQuiz() {
    }

    public ModelQuiz(String quiz, boolean answer) {
        mQuiz = quiz;
        mAnswer = answer;
    }

    public String getQuiz() {
        return mQuiz;
    }

    public void setQuiz(String quiz) {
        mQuiz = quiz;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }

    @Override
    public String toString() {
        return "ModelQuiz{" +
                "mQuiz='" + mQuiz + '\'' +
                ", mAnswer=" + mAnswer +
                '}';
    }
}
