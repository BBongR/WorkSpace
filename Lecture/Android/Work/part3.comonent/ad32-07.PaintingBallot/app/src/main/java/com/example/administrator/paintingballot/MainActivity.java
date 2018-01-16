package com.example.administrator.paintingballot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9;
    private Button btn1;
    private int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private String[] sarray = {"써니", "완득이", "괴물", "라디오스타", "비열한거리", "왕의남자", "아일랜드", "동막골", "헬보이"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        btn1 = findViewById(R.id.btn1);

        ClickListener clickListener = new ClickListener();
        img1.setOnClickListener(clickListener);
        img2.setOnClickListener(clickListener);
        img3.setOnClickListener(clickListener);
        img4.setOnClickListener(clickListener);
        img5.setOnClickListener(clickListener);
        img6.setOnClickListener(clickListener);
        img7.setOnClickListener(clickListener);
        img8.setOnClickListener(clickListener);
        img9.setOnClickListener(clickListener);
        btn1.setOnClickListener(clickListener);


    }

    private class ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.img1:
                    count(sarray[0], 0);
                    break;

                case R.id.img2:
                    count(sarray[1], 1);
                    break;

                case R.id.img3:
                    count(sarray[2], 2);
                    break;

                case R.id.img4:
                    count(sarray[3], 3);
                    break;

                case R.id.img5:
                    count(sarray[4], 4);
                    break;

                case R.id.img6:
                    count(sarray[5], 5);
                    break;

                case R.id.img7:
                    count(sarray[6], 6);
                    break;

                case R.id.img8:
                    count(sarray[7], 7);
                    break;

                case R.id.img9:
                    count(sarray[8], 8);
                    break;

                case R.id.btn1:
                    Intent i = new Intent(getApplicationContext(), SubActivity.class);
                    i.putExtra("title", sarray);
                    i.putExtra("count", array);
                    startActivity(i);
                    break;
            }
        }
    }

    private void count(String s, int a) {
        array[a]++;
        Toast.makeText(getApplicationContext(), s + array[a], Toast.LENGTH_SHORT).show();
    }
}
