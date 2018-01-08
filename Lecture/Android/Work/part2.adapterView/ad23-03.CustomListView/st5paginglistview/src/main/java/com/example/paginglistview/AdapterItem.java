package com.example.paginglistview;

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
 * Created by Administrator on 2018-01-05.
 */

public class AdapterItem extends ArrayAdapter<ModelItem> {

    private final Context context;

    public AdapterItem(@NonNull Context context, int resource, @NonNull List<ModelItem> objects) {
        super(context, resource, objects);

        this.context = context;
    }

    /**
     * ViewHolder 란 커스텀뷰의 위젯을 닫는 클래스다
     */
    private class ViewHolder {
        ImageView iconItem  ;
        TextView  dataItem01 ;
        TextView  dataItem02 ;
        TextView  dataItem03 ;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemLayout = LayoutInflater.from( context )
                .inflate(R.layout.customview_item, parent, false );

        ViewHolder holder = (ViewHolder) itemLayout.getTag();

        if( holder == null ) {
            holder = new ViewHolder();

            holder.iconItem         = itemLayout.findViewById(R.id.iconItem   );
            holder.dataItem01       = itemLayout.findViewById(R.id.dataItem01 );
            holder.dataItem02       = itemLayout.findViewById(R.id.dataItem02 );
            holder.dataItem03       = itemLayout.findViewById(R.id.dataItem03 );

            itemLayout.setTag( holder );
        }

        holder.iconItem  .setImageDrawable( getItem(position).getIconItem  () );
        holder.dataItem01.setText         ( getItem(position).getDataItem01() );
        holder.dataItem02.setText         ( getItem(position).getDataItem02() );
        holder.dataItem03.setText         ( getItem(position).getDataItem03() );

        return itemLayout;
    }

}
