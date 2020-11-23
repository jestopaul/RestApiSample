package com.jpappsworld.recycelrviewapp.adapter.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jpappsworld.recycelrviewapp.R;

public class AndroidHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public AndroidHolder(@NonNull View itemView) {
        super(itemView);
        tvName = itemView.findViewById(R.id.tv_name);
    }
}
