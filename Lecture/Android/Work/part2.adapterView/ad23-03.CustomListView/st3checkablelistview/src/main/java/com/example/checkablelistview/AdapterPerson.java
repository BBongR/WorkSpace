package com.example.checkablelistview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class AdapterPerson extends ArrayAdapter<ModelPerson>  {
    private List<ModelPerson> list = null;

    public AdapterPerson(@NonNull Context context, int resource, @NonNull List<ModelPerson> objects) {
        super(context, resource, objects);
        list = objects;
    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        return getViewWidget(position,  convertView, parent);
        //return getViewPerson(position,  convertView, parent);
    }

    class ViewHolderWidget {
        ImageView imagePhoto;
        TextView  textName  ;
        TextView  textAge   ;
        CheckBox  imageCheck;
        RelativeLayout rlayout;
    }

    public View getViewWidget(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View  rowView = convertView;

        // reuse views
        ViewHolderWidget viewHolder = null;

        if( rowView == null ){
            // 커스텀뷰 디자인 파일 inflation 하기.
            // inflation이란 xml 을 자바 인스턴스로 바꾸는 것.
            // res/layout/view_person.xml
            rowView = LayoutInflater.from( getContext() )
                          .inflate(R.layout.view_person, null,false );

            viewHolder = new ViewHolderWidget();
            viewHolder.textName    = rowView.findViewById(R.id.text_name  );
            viewHolder.textAge     = rowView.findViewById(R.id.text_age   );
            viewHolder.imagePhoto  = rowView.findViewById(R.id.image_photo);
            viewHolder.imageCheck  = rowView.findViewById(R.id.image_check);
            viewHolder.rlayout     = rowView.findViewById(R.id.rlayout    );

            rowView.setTag( viewHolder );
        }
        else {
            viewHolder = (ViewHolderWidget) rowView.getTag();
        }

        // 값 설정
        viewHolder.textName  .setText         ( list.get(position).getName() );
        viewHolder.textAge   .setText         ( list.get(position).getAge() +"" );
        viewHolder.imagePhoto.setImageDrawable( list.get(position).getPhoto());
        viewHolder.imageCheck.setChecked      ( list.get(position).isCheck() );

        if( list.get(position).isCheck() ) {
            viewHolder.rlayout.setBackgroundColor(Color.MAGENTA );
        }
        else {
            viewHolder.rlayout.setBackgroundColor(Color.TRANSPARENT );
        }

        viewHolder.imageCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean newState = !list.get(position).isCheck();
                list.get(position).setCheck( newState );
                if( newState ) {
                    ((View)v.getParent()).setBackgroundColor(Color.MAGENTA );
                }
                else {
                    ((View)v.getParent()).setBackgroundColor(Color.TRANSPARENT );
                }

                Log.d("getViewWidget", getItem(position).toString() );
            }
        });

        return rowView;
    }


    class ViewHolderPerson {
        ViewPerson vp;
    }

    public View getViewPerson(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewPerson rowView = (ViewPerson)convertView;

        // reuse views
        ViewHolderPerson viewHolder = null;

        if( rowView == null ){
            rowView = new ViewPerson( parent.getContext() );

            viewHolder = new ViewHolderPerson();
            viewHolder.vp = rowView;

            rowView.setTag( viewHolder );
        }
        else {
            viewHolder = (ViewHolderPerson) rowView.getTag();
        }


        // ViewPerson 인스턴스에 값 설정
        ModelPerson p = getItem(position);
        p.setPosition( position );
        rowView.setPerson( p );


        rowView.setOnClickListener(new ViewPerson.OnClickListener() {
            @Override
            public void onClick(ViewPerson personView, ModelPerson person) {

                boolean newState = !person.isCheck();
                personView.setChecked( newState );
                list.get( person.getPosition() ).setCheck( newState );

                Log.d("AdapterPerson", getItem(position).toString() );
            }
        });

        return rowView;
    }
}
