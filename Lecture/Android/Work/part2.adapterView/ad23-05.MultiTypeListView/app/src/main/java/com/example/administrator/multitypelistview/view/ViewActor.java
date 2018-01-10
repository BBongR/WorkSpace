package com.example.administrator.multitypelistview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.multitypelistview.R;
import com.example.administrator.multitypelistview.model.ModelActor;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ViewActor extends RelativeLayout {

    private int       type = 0;
    private ImageView imagePhoto;
    private TextView  textName;
    private TextView  textAge;
    private TextView  textDescription;

    public ViewActor(Context context) {
        super(context);
        init(context, null, 0);
    }

    public ViewActor(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public ViewActor(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int i) {
        View rowView = LayoutInflater.from(context).inflate(R.layout.view_actor, this, true);

        imagePhoto      = rowView.findViewById( R.id.imagePhoto      );
        textName        = rowView.findViewById( R.id.textName        );
        textAge         = rowView.findViewById( R.id.textAge         );
        textDescription = rowView.findViewById( R.id.textDescription );

        // attrs 관련 설정. attrs 로 정의한 속성 값 가져와서 찾은 위젯에 값으로 설정

    }

    private ModelActor actor;

    public ModelActor getActor() {
        return actor;
    }

    public void setActor(ModelActor actor) {
        this.actor = actor;

        imagePhoto.setImageDrawable( actor.getImagePhoto()      );
        textName       .setText    ( actor.getTextName()        );
        textAge        .setText    ( actor.getTextAge()         );
        textDescription.setText    ( actor.getTextDescription() );
    }
}
