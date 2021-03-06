package com.tohf.android.tohfa;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter2 extends ArrayAdapter<String> {

    public CustomAdapter2(Context context, String[] foods) {
        super(context,R.layout.custom_row2 ,foods);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater buckysInflater = LayoutInflater.from(getContext());

        View customView = buckysInflater.inflate(R.layout.custom_row2, parent, false);

        String singleFoodItem = getItem(position);

        TextView buckysText = (TextView)customView.findViewById(R.id.buckysText);

        ImageView buckysImage = (ImageView)customView.findViewById(R.id.buckysImage);

        buckysText.setText(singleFoodItem);

        buckysImage.setImageResource(R.mipmap.shrine1);


        return customView;
    }




}

