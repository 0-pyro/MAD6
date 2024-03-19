package com.example.contacts;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.contacts.R;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    public List<contacts> localDataset;
    public Context context;

    public CustomAdapter(Context context, List<contacts> cons) {
        this.context = context;
        localDataset = cons;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.text_row_item, viewGroup, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.name.setText(localDataset.get(position).getName());
        viewHolder.number.setText(localDataset.get(position).getNumber());
        viewHolder.img.setImageResource(localDataset.get(position).getImage());
    }
    @Override
    public int getItemCount() {
        return localDataset.size();
    }
}
