package com.jpappsworld.recycelrviewapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.jpappsworld.recycelrviewapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Create an ArrayList of monitor objects
        ArrayList<Monitor> monitors = new ArrayList<Monitor>();

        monitors.add(new Monitor("HP Z32x", "CN000001", R.drawable.icon_colorcalibration));
        monitors.add(new Monitor("HP Engage", "CN000002", R.drawable.icon_colorcalibration));
        monitors.add(new Monitor("Z24iG4", "CN000003", R.drawable.icon_colorcalibration));
        monitors.add(new Monitor("Z27FG3", "CN000004", R.drawable.icon_colorcalibration));

        DisplayTypeAdapter displayTypeAdapter = new DisplayTypeAdapter(this, monitors);

        ListView listView =  findViewById(R.id.monitorListView);
        listView.setAdapter(displayTypeAdapter);
    }
}