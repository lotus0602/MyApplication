package com.example.p.myapplication.api;

import com.example.p.myapplication.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APITestClient {
    @GET("/users")
    Call<List<User>> getUsers ();
}
