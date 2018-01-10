package com.example.administrator.multitypelistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

import com.example.administrator.multitypelistview.model.ModelActor;

/**
 * Created by Administrator on 2018-01-10.
 */

public class AdapterActor extends ArrayAdapter {

    // 뷰 타입 설정
    public static final int VIEW_TYPE_ACTOR   = 0;
    public static final int VIEW_TYPE_TITLE   = 1;
    public static final int VIEW_TYPE_MOVIE   = 2;
    public static final int VIEW_TYPE_DRAMA   = 3;
    public static final int VIEW_TYPE_COMMENT = 4;
    public static final int VIEW_TYPE_COUNT   = 5;

    private Context context;

    // 아답터 데이터 설정
    private ModelActor actor;

    public ModelActor getActor() {
        return actor;
    }

    public void setActor(ModelActor actor) {
        this.actor = actor;
        // 앱 실행중 데이터 변경시 화면 새로고침
        notifyDataSetChanged();
    }

    public AdapterActor(@NonNull Context context) {
        super(context, -1);

        this.context = context;
    }

    @Override
    public int getViewTypeCount() {
        return VIEW_TYPE_COUNT;
    }

    @Override
    public int getItemViewType(int position) {
        int VIEW_TYPE = -1;

        if( position == 0 ) {
            return VIEW_TYPE_ACTOR;
        }

        position = position -1; // actor 때문에 -1

        if( actor.getMovies().size() > 0 ) {
            if( position == 0 ) {
                return VIEW_TYPE_TITLE;
            }

            position = position -1; // movie 타이틀 때문에 -1

            if( position < actor.getMovies().size() ){
                return VIEW_TYPE_MOVIE;
            }

            position = position - actor.getMovies().size();
        }

        if( actor.getDramas().size() > 0 ) {
            if( position == 0 ) {
                return VIEW_TYPE_TITLE;
            }

            position = position -1; // drama 타이틀 때문에 -1

            if( position < actor.getDramas().size() ){
                return VIEW_TYPE_DRAMA;
            }

            position = position - actor.getDramas().size();
        }

        if( actor.getComments().size() > 0 ) {
            if( position == 0 ) {
                return VIEW_TYPE_TITLE;
            }

            position = position -1; // comment 타이틀 때문에 -1

            if( position < actor.getComments().size() ){
                return VIEW_TYPE_COMMENT;
            }

            position = position - actor.getComments().size();
        }

        return VIEW_TYPE;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        if( position == 0 ){
            return actor;
        }

        position = position -1;

        if ( actor.getMovies().size() > 0 ) {
            if ( position == 0 ) {
                return "Model Movie"; // movie 의 타이틀 값을 리턴
            }

            position = position - 1; // position 값을 0을 기준으로 계산 할 수 있도록 조정 position == 0

            if ( position < actor.getMovies().size() ) {
                return actor.getMovies().get( position );
            }

            position = position - actor.getMovies().size(); // // position 값을 0을 기준으로 계산 할 수 있도록 조정 position == 0
        }

        if ( actor.getDramas().size() > 0 ) {
            if ( position == 0 ) {
                return "Model Drama"; // movie 의 타이틀 값을 리턴
            }

            position = position - 1; // position 값을 0을 기준으로 계산 할 수 있도록 조정 position == 0

            if ( position < actor.getDramas().size() ) {
                return actor.getDramas().get( position );
            }

            position = position - actor.getDramas().size(); // // position 값을 0을 기준으로 계산 할 수 있도록 조정 position == 0
        }

        if ( actor.getComments().size() > 0 ) {
            if ( position == 0 ) {
                return "Model Comment"; // movie 의 타이틀 값을 리턴
            }

            position = position - 1; // position 값을 0을 기준으로 계산 할 수 있도록 조정 position == 0

            if ( position < actor.getComments().size() ) {
                return actor.getComments().get( position );
            }

            position = position - actor.getComments().size(); // // position 값을 0을 기준으로 계산 할 수 있도록 조정 position == 0
        }

        return null;
    }

    @Override
    public int getCount() {
        // 타이틀이 추가되면서 개수 변경되는 문제가 발생
        // 따라서 타이틀 개수를 빼주어야 된다
        int count = 0;

        // actor 개수 계산
        if( actor == null )
            return 0;
        else
            count = count + 1;

        // movie 개수 계산
        if( actor.getMovies().size() > 0 ) {
            // 타이틀 개수
            count = count + ( 1 + actor.getMovies().size() );
        }

        // drama 개수 계산
        if( actor.getDramas().size() > 0 ) {
            // 타이틀 개수
            count = count + ( 1 + actor.getDramas().size() );
        }

        // comment 개수 계산
        if( actor.getComments().size() > 0 ) {
            // 타이틀 개수
            count = count + ( 1 + actor.getComments().size() );
        }

        return count;
    }
}
