package com.example.administrator.newcustomlistview;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018-01-08.
 */

public class AdapterPerson extends ArrayAdapter<ModelPerson> {

    // 1. context 추가, lists 추가
    private Context context;
    private List<ModelPerson> lists = null;

    public AdapterPerson(@NonNull Context context, int resource, @NonNull List<ModelPerson> objects) {
        super(context, resource, objects);

        // 2.
        this.context = context;
        this.lists = objects;
    }

    // 3. getView Override 해서 사용
    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // return getViewHolder(position, convertView, parent);
        return getViewClass( position, convertView, parent );

    }

    @NonNull
    private View getViewClass(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // xml  ->  class  -> getView
        // getView 에서 하던 inflation 을 class 로 이전하기 위해 ViewPerson 만들기
        // 리스트뷰 의 row 는 ViewPerson 이다
        ViewPerson rowView = (ViewPerson) convertView;

        if( rowView == null ){
            rowView = new ViewPerson( parent.getContext() );
//            rowView.setTag( "exist" ); 필요없음 써놧길래 주석
        } else {
            // 작업 없음
        }

        // 데이터 ViewPerson 에 데이터 설정
        ModelPerson p = lists.get( position );
        rowView.setPerson( p );

        return rowView;
    }

    @NonNull
    private View getViewHolder(final int position, @Nullable View convertView) {
        // 9-3
        View rowView = convertView;

        ViewHolder holder;

        if (rowView == null) {

            rowView = LayoutInflater.from(this.context).inflate(R.layout.view_person, null, false);

            // 9-5
            holder = new ViewHolder();

            holder.imagePhoto = rowView.findViewById(R.id.image_photo);
            holder.textName   = rowView.findViewById(R.id.text_name  );
            holder.textAge    = rowView.findViewById(R.id.text_age   );
            holder.imageCheck = rowView.findViewById(R.id.image_check);

            // 9-6
            rowView.setTag(holder);

        } else {

            // 9-7
            holder = (ViewHolder) rowView.getTag();

        }

        // 9-8
        ModelPerson p = lists.get(position);

        // 9-9
        holder.imagePhoto.setImageDrawable(p.getImage_photo());
        holder.textName.setText(p.getText_name()             );
        holder.textAge.setText(p.getText_age()               );
        holder.imageCheck.setChecked(p.getImage_check()      );

        // 리스트뷰를 위 아래로 스크롤 할 때. 화면 새로고침을 위해서...
        redrawCustomView(p, rowView);

        final View finalRowView = rowView;
        // 11. 체크하면 배경색 변경되게 코딩 시작
        holder.imageCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ModelPerson person = lists.get( position ); // 체크된 곳 가져오기

                // check 상태 반전하여 저장
                // p.setImage_check -> !p.setImage_check
                // false            -> true
                // true             -> false
                person.setImage_check( ! person.getImage_check() );

                // 현재 row 에서 체크박스를 클릭 했을 때 화면의 새로고침을 위해서...
                redrawCustomView(person, finalRowView);
            }
        });

        return rowView; // 4. 여기까지 하고 main 레이아웃에 리스트뷰 추가
    }

    private void redrawCustomView(ModelPerson person, View finalRowView) {
        if( person.getImage_check() ){
            // 배경색 칠하기
            finalRowView.setBackgroundColor( Color.MAGENTA );

        } else {
            // 배경색 칠하기
            finalRowView.setBackgroundColor( Color.TRANSPARENT );

        }
    }

    // 9-4 ViewHolder
    private class ViewHolder {
        ImageView imagePhoto;
        TextView  textName;
        TextView  textAge;
        CheckBox  imageCheck;
    }
}
