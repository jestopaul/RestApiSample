package com.jpappsworld.recycelrviewapp.activity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.jpappsworld.recycelrviewapp.R;

import java.util.ArrayList;

public class

DisplayTypeAdapter extends ArrayAdapter<Monitor> {
    private static final String LOG_TAG = DisplayTypeAdapter.class.getSimpleName();

    public DisplayTypeAdapter(Activity context, ArrayList<Monitor> monitors) {
        super(context, 0,monitors);
    }
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
            Monitor currentDesert = getItem(position);

            TextView nameTextView = (TextView) listItemView.findViewById(R.id.monitor_name);

            nameTextView.setText(currentDesert.getMonitorName());
            TextView numberTextView = (TextView) listItemView.findViewById(R.id.monitor_number);
            numberTextView.setText(String.valueOf(currentDesert.getMonitorSerialNumber()));

            ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
            iconView.setImageResource(currentDesert.getImageResourceId());
        }
            return listItemView;
        }
    }


