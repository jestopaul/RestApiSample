package com.jpappsworld.recycelrviewapp.webservice;

import com.jpappsworld.recycelrviewapp.domain.Movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("volley_array.json")
    Call<List<Movies>> getMovies();
}
