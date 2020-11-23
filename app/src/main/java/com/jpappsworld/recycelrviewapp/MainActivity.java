package com.jpappsworld.recycelrviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jpappsworld.recycelrviewapp.adapter.AndroidAdapter;
import com.jpappsworld.recycelrviewapp.domain.Versions;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAndroidVersions;
    private AndroidAdapter adapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();
        setAdapter(getAllAndroidVersions());
    }

    private void initializeViews() {
        rvAndroidVersions = findViewById(R.id.rv_android_versions);
        rvAndroidVersions.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvAndroidVersions.setLayoutManager(linearLayoutManager);

    }

    private void setAdapter(List<Versions> versionsList){
        adapter = new AndroidAdapter(versionsList);
        rvAndroidVersions.setAdapter(adapter);
    }

    private List<Versions> getAllAndroidVersions() {
        List<Versions> versions = new ArrayList<>();
        for(int i = 0; i < 12; i++) {
            Versions vers = new Versions();
            vers.setVersionName("Android" + i +1);
            versions.add(vers);
        }
        return versions;
    }
}