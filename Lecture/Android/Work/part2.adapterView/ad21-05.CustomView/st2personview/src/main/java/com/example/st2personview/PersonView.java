package com.example.st2personview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-26.
 */

public class PersonView extends RelativeLayout {

    // 위젯 선언.
    ImageView image_photo, image_check;
    TextView text_name, text_age;

    // OnImageClickListener 이벤트 발생시 전달할 데이터
    private PersonData person = null;

    // 인터페이스 정의
    public interface OnImageClickListener {
        void onImageClick(PersonView view, PersonData person);
    }

    // 인터페이스 선언
    OnImageClickListener imageClickListener;

    public void setOnImageClickListener(OnImageClickListener listener) {
        this.imageClickListener = listener;
    }

    public PersonView(Context context) {
        super(context);

        init(context, null, 0);
    }

    public PersonView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs, 0);
    }

    public PersonView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        // Layout 관련 필수 속성 설정.
        // RelativeLayout 은 필수 속성 없음

        // 디자인 xml 파일 inflation 하기. inflation 이란 xml 을 자바 인스턴스로 바꾸는것.
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_person, this, true);

        // 위젯 찾기.
        text_name = findViewById(R.id.text_name);
        text_age = findViewById(R.id.text_age);
        image_photo = findViewById(R.id.image_photo);
        image_check = findViewById(R.id.image_check);

        // 커스텀뷰 디자인에서 attrs 로 정의한 속성 값 가져와서 찾은 위젯에 값으로 설정.
        if (attrs != null) {
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PersonView, defStyleAttr, 0);

            // app:my_name 에서 설정한 속성 값
            String name = ta.getString(R.styleable.PersonView_my_name);
            text_name.setText(name);

            // app:my_age 에서 설정한 속성 값
            int age = ta.getInt(R.styleable.PersonView_my_age, -1);
            text_age.setText(age + "");

            // app:my_photo 에서 설정한 속성 값
            Drawable photo = ta.getDrawable(R.styleable.PersonView_my_photo);
            image_photo.setImageDrawable(photo);

            // 재사용. 반드시 호출.
            ta.recycle();

            person = new PersonData(name, age, photo);
        }

        //
        image_photo.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PersonView.this.imageClickListener != null) {
                    // 컨테이너 위젯(부모)으로 이벤트 발생시킴
                    imageClickListener.onImageClick(PersonView.this, person);
                }
            }
        });
    }
}
