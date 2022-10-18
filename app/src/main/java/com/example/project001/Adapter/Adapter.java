package com.example.project001.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.project001.R;

public class Adapter extends BaseAdapter {
private Context mContext;


//Constructor
public Adapter(Context c){
    mContext = c;
}


@Override
public int getCount(){
    return mThumbIds.length;
}

public Object getItem(int position){
    return null;
}

public long getItemId(int position){
    return 0;
}
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(500,500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);

        }
        else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;

    }
public Integer[] mThumbIds = {
        R.drawable.img001,
        R.drawable.img002,
        R.drawable.img003,
        R.drawable.img004,
        R.drawable.img005,
        R.drawable.img006,
        R.drawable.img007,
        R.drawable.img008,
        R.drawable.img009
};


}
