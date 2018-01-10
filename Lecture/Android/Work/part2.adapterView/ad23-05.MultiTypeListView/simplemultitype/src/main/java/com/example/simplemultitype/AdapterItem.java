package com.example.simplemultitype;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2018-01-10.
 */

public class AdapterItem extends ArrayAdapter<ModelItem> {

    // 4. VIew type 상수 선언
    public static final int ITEM_VIEW_TYPE_TEXT   = 0 ; // item1
    public static final int ITEM_VIEW_TYPE_IMAGES = 1 ; // item2
    public static final int ITEM_VIEW_TYPE_COUNT  = 2 ; // view 총 개수

    // 6-1.
    LayoutInflater inflater;

    // 2.
    private final Context         context;
    private final List<ModelItem> datas;

    public AdapterItem(@NonNull Context context, int resource, @NonNull List<ModelItem> objects) {
        super(context, resource, objects);
        // 1.
        this.context  = context;
        this.datas    = objects;
        // 6-2.
        this.inflater = LayoutInflater.from( context );
    }

    // 3.
    @Override
    public int getItemViewType(int position) {
        return datas.get( position ).getType();
    }
    // 3.
    @Override
    public int getViewTypeCount() {
        return ITEM_VIEW_TYPE_COUNT;
    }

    // 7. 홀더 만들기
    private class ViewHolder {
        // type1
        TextView  title;
        TextView  desc;
        // type2
        ImageView image;
        TextView  name;
    }

    // 3.
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // 4.
        View rowView = convertView;
        // 5.
        int viewType = getItemViewType( position );

        // 8.
        ViewHolder holder;

        // 9.
        ModelItem item = datas.get( position );

        // 6. View 가져오기
        if( rowView == null ){
            // inflation 은 생성자에서 처리

            // 10.
            holder = new ViewHolder();

            switch ( viewType ) {
                case ITEM_VIEW_TYPE_TEXT:
                    rowView = inflater.inflate( R.layout.listview_item1, parent, false );

                    holder.title = rowView.findViewById( R.id.title1 );
                    holder.desc  = rowView.findViewById( R.id.desc   );

                    break;

                case ITEM_VIEW_TYPE_IMAGES:
                    rowView = inflater.inflate( R.layout.listview_item2, parent, false );

                    holder.image = rowView.findViewById( R.id.image1 );
                    holder.name  = rowView.findViewById( R.id.name   );

                    break;
            }

            rowView.setTag( holder );
        } else {

            holder = ( ViewHolder ) rowView.getTag();

        }

        // 11.
        // 데이터 넣기
        switch ( viewType ) {
            case ITEM_VIEW_TYPE_TEXT:

                holder.title.setText( item.getTitle() );
                holder.desc .setText( item.getDesc()  );

                break;

            case ITEM_VIEW_TYPE_IMAGES:

                holder.image.setImageDrawable( item.getImage() );
                holder.name .setText         ( item.getName()  );

                break;
        }

        return rowView;
    }
}
