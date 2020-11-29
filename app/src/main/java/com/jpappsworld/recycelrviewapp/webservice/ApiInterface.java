package com.jpappsworld.recycelrviewapp.webservice;

import com.jpappsworld.recycelrviewapp.domain.Movies;
import com.jpappsworld.recycelrviewapp.webservice.rest.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @GET("volley_array.json")
    Call<List<Movies>> getMovies();

    @POST("users")
    Call<User> createUser(@Body User user);
}
