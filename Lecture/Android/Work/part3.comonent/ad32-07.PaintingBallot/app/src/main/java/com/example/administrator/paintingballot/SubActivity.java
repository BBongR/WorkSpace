package com.example.administrator.paintingballot;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.content.Intent;

import java.util.Arrays;

public class SubActivity extends AppCompatActivity {

    private Button btnBack;
    private ImageView imgSub;
    private TextView txtTitle, tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;
    private RatingBar rBar1, rBar2, rBar3, rBar4, rBar5, rBar6, rBar7, rBar8, rBar9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btnBack = findViewById(R.id.btnBack);
        imgSub = findViewById(R.id.imgSub);
        txtTitle = findViewById(R.id.txtTitle);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        rBar1 = findViewById(R.id.rBar1);
        rBar2 = findViewById(R.id.rBar2);
        rBar3 = findViewById(R.id.rBar3);
        rBar4 = findViewById(R.id.rBar4);
        rBar5 = findViewById(R.id.rBar5);
        rBar6 = findViewById(R.id.rBar6);
        rBar7 = findViewById(R.id.rBar7);
        rBar8 = findViewById(R.id.rBar8);
        rBar9 = findViewById(R.id.rBar9);

        RatingBar[] rBars = {rBar1, rBar2, rBar3, rBar4, rBar5, rBar6, rBar7, rBar8, rBar9};
        TextView[] tvs = {tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9};

        Intent i = getIntent();
        String[] sarray = i.getStringArrayExtra("title");
        int[] array = i.getIntArrayExtra("count");

        int[] temp = Arrays.copyOf(array, 9);

        Arrays.sort(temp);

        for (int j =0 ; j <9 ; j++ ) {
            if (array[j]==temp[temp.length-1]) {
                txtTitle.setText(sarray[j]);
                imgSub.setImageDrawable(CheckImg(sarray[j]));
            }
        }

        for (int j = 0; j < 9; j++) {
            rBars[j].setRating(array[j]);
            tvs[j].setText(sarray[j]);
        }
    }

    private Drawable CheckImg(String s) {
        Drawable d;
        if (s.equals("써니")) {
            d = getResources().getDrawable(R.drawable.mov01);
            return d;
        }
        return null;
    }
}
