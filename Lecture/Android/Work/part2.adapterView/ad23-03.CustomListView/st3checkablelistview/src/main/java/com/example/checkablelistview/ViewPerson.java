package com.example.checkablelistview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ViewPerson extends RelativeLayout  {

    // 인터페이스 정의
    public static interface OnClickListener {
        void onClick(ViewPerson personView, ModelPerson person);
    }

    // 인터페이스 리스너 선언
    private OnClickListener checkedListener;
    public void setOnClickListener( OnClickListener listener ) {
        this.checkedListener = listener;
    }

    // 위젯 선언
    ImageView imagePhoto;
    TextView  textName;
    TextView  textAge;
    CheckBox  imageCheck;

    public ViewPerson(Context context) {
        this(context, null, 0);
    }

    public ViewPerson(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewPerson(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        // Layout 관련 필수 속성 설정.
        // 없음.

        // 커스텀뷰 디자인 파일 inflation 하기.
        // inflation이란 xml 을 자바 인스턴스로 바꾸는 것.
        // res/layout/view_person.xml
        LayoutInflater.from( context )
                      .inflate(R.layout.view_person, this,true );

        // 위젯 찾기
        textName    = findViewById(R.id.text_name  );
        textAge     = findViewById(R.id.text_age   );
        imagePhoto  = findViewById(R.id.image_photo);
        imageCheck  = findViewById(R.id.image_check);

        imageCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkedListener.onClick(ViewPerson.this, person);
            }
        });
    }


    boolean isChecked;

    public void setChecked(boolean checked) {
        if( isChecked != checked ) {
            this.isChecked = checked;
            drawCheck();
        }
    }

    private void drawCheck() {
        imageCheck.setChecked( this.isChecked );
        if( this.isChecked ) {
            this.setBackgroundColor(Color.MAGENTA );
        }
        else {
            this.setBackgroundColor(Color.TRANSPARENT );
        }

        Log.d("ViewPerson", isChecked + "" );
    }


    // ModelPerson 데이터 선언
    ModelPerson person;

    public ModelPerson getPerson() {
        return person;
    }

    public void setPerson(ModelPerson person) {
        this.person = person;

        // 추가
        imagePhoto.setImageDrawable( person.getPhoto() );
        textName  .setText( person.getName() );
        textAge   .setText( person.getAge() + "" );
        this.setChecked(  person.isCheck()  );
    }

}
