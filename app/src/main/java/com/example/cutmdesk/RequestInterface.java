package com.example.cutmdesk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface RequestInterface {


    @GET("data")
    Call<List<StudentDetailsModal>> fetchDetails();
}
