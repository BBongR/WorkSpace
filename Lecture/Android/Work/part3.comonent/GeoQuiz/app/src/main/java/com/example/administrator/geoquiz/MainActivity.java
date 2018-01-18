package com.example.administrator.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ModelQuiz> quizs;
    ModelQuiz quiz;
    int index = 0;
    public static final int REQUEST_CODE = 10000;

    private TextView text_quiz;
    private Button btn_true;
    private Button btn_false;
    private Button btn_cunning;
    private Button btn_next;
    private Button btn_before;

    private void initData() {
        quizs = new ArrayList<>();

        quiz = new ModelQuiz();
        quiz.setQuiz("태평양은 대서양보다 더 크다");
        quiz.setAnswer(true);
        quizs.add(quiz);

        quiz = new ModelQuiz();
        quiz.setQuiz("수에즈 운하는 홍해와 인도양을 연결한다");
        quiz.setAnswer(false);
        quizs.add(quiz);

        quiz = new ModelQuiz();
        quiz.setQuiz("나일강은 이집트에서 시작된다");
        quiz.setAnswer(false);
        quizs.add(quiz);

        quiz = new ModelQuiz();
        quiz.setQuiz("아마존강은 아메리카 대륙에서 가장 긴 강이다");
        quiz.setAnswer(true);
        quizs.add(quiz);

        quiz = new ModelQuiz();
        quiz.setQuiz("바이칼 호수는 세계에서 가장 오래되고 가장 깊은 담수호이다");
        quiz.setAnswer(true);
        quizs.add(quiz);
    } // initData()

    private void checkAnswer(boolean b) {
        if (b) {
            Toast.makeText(MainActivity.this, "정답", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "틀림", Toast.LENGTH_SHORT).show();
        }
    } // checkAnswer()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 데이터
        initData();

        text_quiz = findViewById(R.id.text_quiz);
        // textView(text_quiz)의 첫번째 질문 등록
        text_quiz.setText(String.valueOf(quizs.get(0).getQuiz()));
        text_quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = (index + 1) % quizs.size();
                text_quiz.setText(quizs.get(index).getQuiz());
            }
        }); //text_quiz

        btn_next = findViewById(R.id.btn_next);
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index = (index + 1) % quizs.size();
                text_quiz.setText(quizs.get(index).getQuiz());
            }
        }); // btn_next

        btn_before = findViewById(R.id.btn_before);
        btn_before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 0) {
                    index = quizs.size();
                }
                index = (index - 1) % quizs.size();
                text_quiz.setText(quizs.get(index).getQuiz());
            }
        }); // btn_before

        btn_true = findViewById(R.id.btn_true);
        btn_true.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(quizs.get(index).isAnswer());
            }
        }); //btn_true

        btn_false = findViewById(R.id.btn_false);
        btn_false.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(!quizs.get(index).isAnswer());
            }
        }); // btn_false

        btn_cunning = findViewById(R.id.btn_cunning);
        btn_cunning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CunningActivity.class);
                i.putExtra(CunningActivity.EXTRA_ANSWER_CODE, quizs.get(index).isAnswer());
                startActivityForResult(i, REQUEST_CODE);
            }
        });
    } // onCreate();

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != RESULT_OK) {
            return;
        }
        if (requestCode == REQUEST_CODE) {
            if (data == null) {
                return;
            }
            else  if (data.getBooleanExtra(CunningActivity.EXTRA_ANSWER_CODE, false)) {
                Toast.makeText(MainActivity.this, "커닝하셨습니다", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
