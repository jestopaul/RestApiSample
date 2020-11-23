package com.jpappsworld.recycelrviewapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jpappsworld.recycelrviewapp.R;

import com.jpappsworld.recycelrviewapp.adapter.holder.MonitorHolder;
import com.jpappsworld.recycelrviewapp.domain.Monitors;


import java.util.List;

public class MonitorAdapter extends RecyclerView.Adapter<MonitorHolder> {
    private List<Monitors> monitorsList;

    public MonitorAdapter(List<Monitors> monitorsList) {
        this.monitorsList = monitorsList;
    }

    @NonNull
    @Override
    public MonitorHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_monitors, parent, false);
        return new MonitorHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MonitorHolder holder, int position) {

        Monitors monitors = monitorsList.get(position);
        holder.monitorNames.setText(monitors.getmDisplayName());
        holder.monitorNumbers.setText(monitors.getmMonitorNumber());
        holder.monitorIcon.setImageResource(monitors.getmImageResourceId());
        holder.expandMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.ll_brightness.setVisibility(View.VISIBLE);
                holder.expandMore.setVisibility(View.GONE);
                holder.expandLess.setVisibility(View.VISIBLE);
            }
        });

        holder.expandLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.ll_brightness.setVisibility(View.GONE);
                holder.expandLess.setVisibility(View.GONE);
                holder.expandMore.setVisibility(View.VISIBLE);
            }
        });

    }

    @Override
    public int getItemCount() {
        return monitorsList.size();
    }
}
