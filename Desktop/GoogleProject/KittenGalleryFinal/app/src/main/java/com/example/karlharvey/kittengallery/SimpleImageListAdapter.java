package com.example.karlharvey.kittengallery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by karlharvey on 14/06/19.
 */

public class SimpleImageListAdapter extends ArrayAdapter {
    private Context context;
    private LayoutInflater inflater;

    private String[] imageUrls;

    public SimpleImageListAdapter(Context context, String[] imageUrls) {
        super(context, R.layout.listview_image, imageUrls);

        this.context = context;
        this.imageUrls = imageUrls;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(null == convertView) {
            convertView = inflater.inflate(R.layout.listview_image, parent, false);
        }

        Glide.with(context).load(imageUrls[position]).into((ImageView) convertView);

        return convertView;
    }

}