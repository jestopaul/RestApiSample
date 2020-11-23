package com.jpappsworld.recycelrviewapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.jpappsworld.recycelrviewapp.R;
import com.jpappsworld.recycelrviewapp.adapter.AndroidAdapter;
import com.jpappsworld.recycelrviewapp.adapter.MonitorAdapter;
import com.jpappsworld.recycelrviewapp.domain.Monitors;
import com.jpappsworld.recycelrviewapp.domain.Movies;
import com.jpappsworld.recycelrviewapp.domain.Versions;
import com.jpappsworld.recycelrviewapp.webservice.ApiClient;
import com.jpappsworld.recycelrviewapp.webservice.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MonitorActivity extends AppCompatActivity {

    private RecyclerView rvMonitors;
    private MonitorAdapter adapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monitor);
        initializeViews();
        setAdapter(getAllMonitors());
        doTask();
    }

    private void initializeViews() {
        rvMonitors = findViewById(R.id.rv_monitors);
        rvMonitors.setHasFixedSize(true);
        linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvMonitors.setLayoutManager(linearLayoutManager);

    }

    private void setAdapter(List<Monitors> monitorsList){
        adapter = new MonitorAdapter(monitorsList);
        rvMonitors.setAdapter(adapter);
    }

    private List<Monitors> getAllMonitors() {
        List<Monitors> monitorsList = new ArrayList<>();
        monitorsList.add(new Monitors("HP Z32x", "CN000001", R.drawable.icon_colorcalibration));
        monitorsList.add(new Monitors("HP Engage", "CN000002", R.drawable.icon_colorcalibration));
        monitorsList.add(new Monitors("Z24iG4", "CN000003", R.drawable.icon_colorcalibration));
        monitorsList.add(new Monitors("Z27FG3", "CN000004", R.drawable.icon_colorcalibration));
        return monitorsList;
    }

    private void doTask(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<List<Movies>> call = apiService.getMovies();

        call.enqueue(new Callback<List<Movies>>() {
            @Override
            public void onResponse(Call<List<Movies>> call, Response<List<Movies>> response) {
                List<Movies> movieList = response.body();
                for (Movies movies:movieList) {
                    Toast.makeText(MonitorActivity.this,movies.getTitle(),
                            Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Movies>> call, Throwable t) {
                Log.e("TAG","Response = "+t.toString());
            }
        });
    }
}