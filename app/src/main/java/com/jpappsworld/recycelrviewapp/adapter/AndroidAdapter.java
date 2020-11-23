package com.jpappsworld.recycelrviewapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jpappsworld.recycelrviewapp.R;
import com.jpappsworld.recycelrviewapp.adapter.holder.AndroidHolder;
import com.jpappsworld.recycelrviewapp.domain.Versions;

import java.util.List;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidHolder> {
    private List<Versions> versionsList;
    public AndroidAdapter(List<Versions> versionsList) {
        this.versionsList = versionsList;
    }

    @NonNull
    @Override
    public AndroidHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_android,parent, false);
        return new AndroidHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidHolder holder, int position) {

        Versions versions = versionsList.get(position);
        holder.tvName.setText(versions.getVersionName());

    }

    @Override
    public int getItemCount() {
        return versionsList.size();
    }
}
