package com.example.cutmdesk.interfaces;

import com.example.cutmdesk.models.StudentDetailsModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

interface RequestInterface {


    @GET("data")
    Call<List<StudentDetailsModel>> fetchDetails();
}
