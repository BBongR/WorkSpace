package com.example.administrator.multitypelistview.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.administrator.multitypelistview.R;
import com.example.administrator.multitypelistview.model.ModelComment;

/**
 * Created by Administrator on 2018-01-09.
 */

public class ViewComment extends RelativeLayout {

    private int      type = 1;
    private TextView textMessage;
    private TextView textWriter;

    public ViewComment(Context context) {
        super(context);
        init(context, null, 0);
    }

    public ViewComment(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public ViewComment(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int i) {
        View rowView = LayoutInflater.from(context).inflate(R.layout.view_comment, this, true);

        textMessage = rowView.findViewById( R.id.textMessage );
        textWriter  = rowView.findViewById( R.id.textWriter  );

        // attrs 관련 설정. attrs 로 정의한 속성 값 가져와서 찾은 위젯에 값으로 설정

    }

    private ModelComment comment;

    public ModelComment getActor() {
        return comment;
    }

    public void setActor(ModelComment comment) {
        this.comment = comment;

        textMessage.setText( comment.getTextMessage() );
        textWriter .setText( comment.getTextWriter()  );
    }
}
