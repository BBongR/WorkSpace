package com.example.administrator.multitypelistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ViewMovie extends RelativeLayout {

    private ImageView imagePicture;
    private TextView  textTitle;
    private TextView  textYear;

    public ViewMovie(Context context) {
        super(context);
        init(context, null, 0);
    }

    public ViewMovie(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public ViewMovie(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int i) {
        View rowView = LayoutInflater.from(context).inflate(R.layout.view_movie, this, true);

        imagePicture = rowView.findViewById( R.id.imagePicture );
        textTitle    = rowView.findViewById( R.id.textTitle    );
        textYear     = rowView.findViewById( R.id.textYear     );

        // attrs 관련 설정. attrs 로 정의한 속성 값 가져와서 찾은 위젯에 값으로 설정

    }

    private ModelMovie movie;

    public ModelMovie getActor() {
        return movie;
    }

    public void setActor(ModelMovie movie) {
        this.movie = movie;

        imagePicture.setImageDrawable( movie.getImagePicture() );
        textTitle   .setText         ( movie.getTextTitle()    );
        textYear    .setText         ( movie.getTextYear()     );
    }
}
