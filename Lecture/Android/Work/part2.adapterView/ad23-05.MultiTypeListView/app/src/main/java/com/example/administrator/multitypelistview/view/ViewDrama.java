package com.example.administrator.multitypelistview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.multitypelistview.R;
import com.example.administrator.multitypelistview.model.ModelDrama;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ViewDrama extends RelativeLayout {

    private int       type = 2;
    private ImageView imagePicture;
    private TextView  textTitle;
    private TextView  textInterval;

    public ViewDrama(Context context) {
        super(context);
        init(context, null, 0);
    }

    public ViewDrama(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public ViewDrama(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int i) {
        View rowView = LayoutInflater.from(context).inflate(R.layout.view_drama, this, true);

        imagePicture = rowView.findViewById( R.id.imagePicture );
        textTitle    = rowView.findViewById( R.id.textTitle    );
        textInterval = rowView.findViewById( R.id.textInterval );

        // attrs 관련 설정. attrs 로 정의한 속성 값 가져와서 찾은 위젯에 값으로 설정

    }

    private ModelDrama drama;

    public ModelDrama getActor() {
        return drama;
    }

    public void setActor(ModelDrama drama) {
        this.drama = drama;

        imagePicture.setImageDrawable( drama.getImagePicture() );
        textTitle   .setText         ( drama.getTextTitle()    );
        textInterval.setText         ( drama.getTextInterval() );
    }
}
