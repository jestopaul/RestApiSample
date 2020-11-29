package com.jpappsworld.recycelrviewapp.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.recyclerview.widget.RecyclerView;

import com.jpappsworld.recycelrviewapp.R;

public class MonitorHolder extends RecyclerView.ViewHolder {

    public TextView monitorNames;
    public TextView monitorNumbers;
    public ImageView monitorIcon;
    public ImageView expandMore;
    public ImageView expandLess;
    public LinearLayout ll_brightness;
    public AppCompatSeekBar seekBar;


    public MonitorHolder(@NonNull View itemView) {
        super(itemView);
        monitorNames = itemView.findViewById(R.id.monitor_names);
        monitorNumbers = itemView.findViewById(R.id.monitor_numbers);
        monitorIcon = itemView.findViewById(R.id.monitor_icon);
        expandMore = itemView.findViewById(R.id.iv_expand_more);
        expandLess = itemView.findViewById(R.id.iv_expand_less);
        ll_brightness = itemView.findViewById(R.id.ll_brightness);
        seekBar = itemView.findViewById(R.id.seekBar);

    }
}
