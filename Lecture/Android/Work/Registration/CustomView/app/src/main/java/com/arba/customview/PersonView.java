package com.arba.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-12-22.
 */

public class PersonView extends RelativeLayout{

    private ImageView imagePhoto, imageCheck, imageSelect;
    private TextView textName, textAge;


    public PersonView(Context context) {
        super(context);
        init(context, null, 0);
    }

    public PersonView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public PersonView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {

        LayoutInflater inflater = LayoutInflater.from(context);
        inflater.inflate(R.layout.view_person, this, true);

        textName = this.findViewById(R.id.text_name);
        textAge = this.findViewById(R.id.text_age);
        imagePhoto = this.findViewById(R.id.image_photo);
        imageCheck = this.findViewById(R.id.image_check);
        imageSelect = this.findViewById(R.id.image_select);

        if(attrs != null) {
            TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.PersonView, defStyleAttr, 0);
            String name = ta.getString(R.styleable.PersonView_name);
            int age = ta.getInt(R.styleable.PersonView_age, -1);
            Drawable photo = ta.getDrawable(R.styleable.PersonView_photo);

            ta.recycle();

            textName.setText(name);
            textAge.setText(age);
            imagePhoto.setImageDrawable(photo);
        }
    }

}
