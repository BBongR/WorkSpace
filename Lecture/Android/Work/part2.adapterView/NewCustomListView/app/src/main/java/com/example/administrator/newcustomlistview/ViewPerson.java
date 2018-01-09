package com.example.administrator.newcustomlistview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ViewPerson extends RelativeLayout {

    private ImageView imagePhoto;
    private TextView  textName;
    private TextView  textAge;
    private CheckBox  imageCheck;

    // a1.
    public ViewPerson(Context context) {
        super(context);
        init(context,null,0);
    }

    public ViewPerson(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs,0);
    }

    public ViewPerson(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    // a2.
    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        // Layout 관련 설정
        // LinearLayout 인 경우는 orientation 을 반드시 설정한다

        // inflation
        View rowView = LayoutInflater.from(context).inflate(R.layout.view_person, this, true);

        imagePhoto  = rowView.findViewById( R.id.image_photo );
        textName    = rowView.findViewById ( R.id.text_name   );
        textAge     = rowView.findViewById( R.id.text_age    );
        imageCheck  = rowView.findViewById ( R.id.image_check );

        // attrs 관련 설정. attrs 로 정의한 속성 값 가져와서 찾은 위젯에 값으로 설정


        // a3.
        // 리스너 설정
        imageCheck.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // check 상태 반전하여 저장
                // p.setImage_check -> !p.setImage_check
                // false            -> true
                // true             -> false
                person.setImage_check( ! person.getImage_check() );

                // 현재 row 에서 체크박스를 클릭 했을 때
                // 클릭된 row 화면의 새로고침...
                redrawCustomView();
            }
        });

    }

    private void redrawCustomView() {
        if( person.getImage_check() ){
            // 배경색 칠하기
            this.setBackgroundColor( Color.argb(200,225,124,233) );
        } else {
            // 배경색 칠하기
            this.setBackgroundColor( Color.TRANSPARENT );
        }
    }

    private ModelPerson person;

    public ModelPerson getPerson() {
        return person;
    }

    public void setPerson(ModelPerson person) {
        this.person = person;

        imagePhoto.setImageDrawable( person.getImage_photo() );
        textName.setText           ( person.getText_name()   );
        textAge.setText            ( person.getText_age()    );
        imageCheck.setChecked      ( person.getImage_check() );
        redrawCustomView();
    }
}
