package com.example.administrator.newcustomlistview;

import android.content.Context;
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
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 9-3
        View rowView = convertView;

        ViewHolder holder;

        if (rowView == null) {

            rowView = LayoutInflater.from(this.context).inflate(R.layout.view_person, null, false);

            // 9-5
            holder = new ViewHolder();

            holder.imagePhoto = rowView.findViewById(R.id.image_photo);
            holder.textName   = rowView.findViewById(R.id.text_name);
            holder.textAge    = rowView.findViewById(R.id.text_age);
            holder.imageCheck = rowView.findViewById(R.id.image_check);

            // 9-6
            rowView.setTag(holder);

        } else {

            // 9-7
            holder = (ViewHolder) rowView.getTag();

        }

        // 9-8
        ModelPerson person = lists.get(position);

        // 9-9
        holder.imagePhoto.setImageDrawable(person.getImage_photo());
        holder.textName.setText(person.getText_name());
        holder.textAge.setText(person.getText_age());
        holder.imageCheck.setChecked(person.getImage_check());

        return rowView; // 4. 여기까지 하고 main 레이아웃에 리스트뷰 추가
    }

    // 9-4 ViewHolder
    private class ViewHolder {
        ImageView imagePhoto;
        TextView  textName;
        TextView  textAge;
        CheckBox  imageCheck;
    }
}
