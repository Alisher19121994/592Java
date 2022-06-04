package com.example.a592java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class FeedsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Feeds> list;

    public FeedsAdapter(Context context, ArrayList<Feeds> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feeds_post, parent, false);
        return new FeedsVeiw(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Feeds feeds = list.get(position);
        if (holder instanceof FeedsVeiw) {
            ((FeedsVeiw) holder).pro.setImageResource(feeds.profile_id);
            ((FeedsVeiw) holder).changeP.setImageResource(feeds.changeable_profile_id);
            ((FeedsVeiw) holder).fullname.setText(feeds.fullname_id);
            ((FeedsVeiw) holder).date.setText(feeds.date_of_update_id);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class FeedsVeiw extends RecyclerView.ViewHolder {
        ShapeableImageView pro;
        ShapeableImageView changeP;
        TextView fullname;
        TextView date;

        public FeedsVeiw(@NonNull View itemView) {
            super(itemView);
            pro = itemView.findViewById(R.id.profile_id);
            changeP = itemView.findViewById(R.id.changeable_profile_id);
            fullname = itemView.findViewById(R.id.fullname_id);
            date = itemView.findViewById(R.id.date_of_update_id);

        }
    }
}
