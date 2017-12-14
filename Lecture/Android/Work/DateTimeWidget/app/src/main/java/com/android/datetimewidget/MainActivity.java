package com.android.datetimewidget;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.DigitalClock;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnalogClock analogClock = findViewById(R.id.analogClock);
        DigitalClock digitalClock = findViewById(R.id.digitalClock);
        Chronometer chronometer = findViewById(R.id.chronometer);
        TimePicker timePicker1 = findViewById(R.id.timePicker1);
        TimePicker timePicker2 = findViewById(R.id.timePicker2);
        DatePicker datePicker1 = findViewById(R.id.datePicker1);
        DatePicker datePicker2 = findViewById(R.id.datePicker2);
        CalendarView calendarView = findViewById(R.id.calendarView);
        TextView textView4 = findViewById(R.id.textView4);
        Button button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "";
                msg += "analogClock = \n";
                msg += "digitalClock = \n";
                msg += "chronometer = \n";
                msg += "timePicker1 = \n";
                msg += "timePicker2 = \n";
                msg += "datePicker1 = \n";
                msg += "datePicker2 = \n";
                msg += "calendarView = \n";

                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        // chronometer 중지 & 시작
        chronometer.stop(); // 중지
        chronometer.setBase(SystemClock.elapsedRealtime()); // 0 시작해서 경과된 시간
        chronometer.start(); // 시작

        // timePicker1 에 시간 설정하기
        timePicker1.setCurrentHour(13);
        timePicker1.setCurrentMinute(35);

        // timePicker1 에 날짜 설정하기
        // 자바에서 날짜를 처리하는 클래스
        // java.util.date 클래스
        // java.util.Calender 클래스
        java.util.Calendar c = Calendar.getInstance();
        datePicker1.updateDate(c.get(Calendar.YEAR)
                             , c.get(Calendar.MONTH)
                             , c.get(Calendar.DAY_OF_MONTH));


        // calendarView 에 날짜 설정하기


    }
}
