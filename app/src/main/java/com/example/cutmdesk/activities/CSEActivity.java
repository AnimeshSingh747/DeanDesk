package com.example.cutmdesk.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.cutmdesk.adapters.Adapter;
import com.example.cutmdesk.R;
import com.example.cutmdesk.models.StudentDataModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class CSEActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<StudentDataModel> studentDataModels;
    private static String JSON_URL = "https://retoolapi.dev/wFuBxz/data";
    Adapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csedata);

        recyclerView = findViewById(R.id.songsList);
        studentDataModels = new ArrayList<>();
        extractSongs();
    }

    private void extractSongs() {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, JSON_URL, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject songObject = response.getJSONObject(i);

                        StudentDataModel studentDataModel = new StudentDataModel();
                        studentDataModel.setFirstName(songObject.getString("First name").toString());
                        studentDataModel.setLastName(songObject.getString("Last name").toString());
                        studentDataModel.setClass_(songObject.getString("Class").toString());
                        studentDataModel.setSemester(songObject.getString("Semester").toString());
                        studentDataModel.setRollNo(songObject.getString("Roll No"));
                        studentDataModel.setContactNo(songObject.getString("Contact No").toString());
                        studentDataModel.setGender(songObject.getString("Gender").toString());


//                        song.setArtists(songObject.getString("artists".toString()));
//                        song.setCoverImage(songObject.getString("cover_image"));
//                        song.setSongURL(songObject.getString("url"));
                        studentDataModels.add(studentDataModel);


                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                adapter = new Adapter(getApplicationContext(),studentDataModels);
                recyclerView.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: " + error.getMessage());
            }
        });

        queue.add(jsonArrayRequest);

    }
}
