package com.example.contacts;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.contacts.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView name, number;
    public ViewHolder(View view) {
        super(view);
        name = (TextView) view.findViewById(R.id.name);
        number = (TextView) view.findViewById(R.id.number);
        img = (ImageView) view.findViewById(R.id.img);
    }

}