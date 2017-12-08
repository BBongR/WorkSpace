package com.android.petapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private CheckBox chkStart;

    private RadioGroup radioG1;

    private Button button1;

    private ImageView img1dog;
    private ImageView img2cat;
    private ImageView img3rabbit;

    private LinearLayout llo2;

    private int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkStart = findViewById(R.id.chkStart);

        radioG1 = findViewById(R.id.radioG1);

        button1 = findViewById(R.id.button1);

        img1dog = findViewById(R.id.img1dog);
        img2cat = findViewById(R.id.img2cat);
        img3rabbit = findViewById(R.id.img3rabbit);

        llo2 = findViewById(R.id.llo2);

        RadioInner ri = new RadioInner();
        CheckInner ci = new CheckInner();
        ButtonInner bi = new ButtonInner();

        chkStart.setOnCheckedChangeListener(ci);

        radioG1.setOnCheckedChangeListener(ri);

        button1.setOnClickListener(bi);

    }

    private class RadioInner implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (i==R.id.radioG1dog) {
                temp = R.id.img1dog;
            }
            else if (i==R.id.radioG1cat) {
                temp = R.id.img2cat;
            }
            else if (i==R.id.radioG1rabbit) {
                temp = R.id.img3rabbit;
            }
        }
    }

    private class CheckInner implements CheckBox.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if(chkStart.isChecked()==true) {
                llo2.setVisibility(View.VISIBLE);
                radioG1.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
            }
            else if(chkStart.isChecked()==false) {
                llo2.setVisibility(View.GONE);
            }
        }
    }

    private class ButtonInner implements Button.OnClickListener {

        @Override
        public void onClick(View view) {
            if(temp == R.id.img1dog) {
                img1dog.setVisibility(View.VISIBLE);

                img2cat.setVisibility(View.GONE);
                img3rabbit.setVisibility(View.GONE);
            }
            else if(temp == R.id.img2cat) {
                img2cat.setVisibility(View.VISIBLE);

                img1dog.setVisibility(View.GONE);
                img3rabbit.setVisibility(View.GONE);
            }
            else if(temp == R.id.img3rabbit) {
                img3rabbit.setVisibility(View.VISIBLE);

                img2cat.setVisibility(View.GONE);
                img1dog.setVisibility(View.GONE);
            }
        }
    }
}
