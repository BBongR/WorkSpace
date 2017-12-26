package com.example.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-22.
 */

public class ColorOptionsView extends LinearLayout {

    private View value;
    private ImageView image;
    private TextView title;

    public ColorOptionsView(Context context) {
        super(context);

        init(context, null, 0);
    }

    public ColorOptionsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(context, attrs, 0);
    }

    public ColorOptionsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        // LinearLayout 관력 속성 설정
        setOrientation(LinearLayout.HORIZONTAL);
        setGravity(Gravity.CENTER);

        // inflation 하기
        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_color_options, this, true);

        // CustomView 속성값 가져오기. 디자인에서
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ColorOptionsView, defStyleAttr, 0);
        String titleText = a.getString(R.styleable.ColorOptionsView_titleText);
        @SuppressLint("ResourceAsColor")
        int valueColor = a.getColor(R.styleable.ColorOptionsView_valueColor, android.R.color.holo_blue_light);

        a.recycle();

        // 0번째 자식에 값 설정
        title = (TextView) this.getChildAt(0);
        title.setText(titleText);

        // 1번째 자식에 값 설정
        value = this.getChildAt(1);
        value.setBackgroundColor(valueColor);

        // 2번째 자식에 값 설정
        image = (ImageView) this.getChildAt(2);
//        setImage(android.R.drawable.btn_plus); // 이미지 넣은거
    }

    public void setValueColor(int color) {
        value.setBackgroundColor(color);
    }

    public void setImage(int resourceID) {
        image.setImageResource(resourceID);
//        image.setImageDrawable();
    }

    public void setImageVisible(boolean visible) {
        image.setVisibility(visible ? View.VISIBLE : View.GONE);
    }

    public String getText() {
        return title.getText().toString();
    }
}
