package com.example.cutmdesk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class csedata extends AppCompatActivity {

    ArrayList<StudentDetailsModal> studentDetailsModals = new ArrayList<StudentDetailsModal>();
    private StudentDetailsAdapter studentDetailsAdapter;
    private RecyclerView recyclerView;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csedata);

        recyclerView = (RecyclerView) findViewById(R.id.studentRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        fetchDetails();


    }

    private void fetchDetails() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://retoolapi.dev/wFuBxz/ ")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RequestInterface requestInterface =  retrofit.create(RequestInterface.class);
        Call<List<StudentDetailsModal>> call =   requestInterface.fetchDetails();

        call.enqueue(new Callback<List<StudentDetailsModal>>() {

            @Override
            public void onResponse(Call<List<StudentDetailsModal>> call, Response<List<StudentDetailsModal>> response) {





                studentDetailsModals = new ArrayList<StudentDetailsModal>(response.body());

                studentDetailsAdapter = new  StudentDetailsAdapter(csedata.this,studentDetailsModals);
                recyclerView.setAdapter(studentDetailsAdapter);
                Toast.makeText(csedata.this,"Succes",Toast.LENGTH_SHORT).show();;

            }


            @Override
            public void onFailure(Call<List<StudentDetailsModal>> call, Throwable t) {
                Toast.makeText(csedata.this,"Failed",Toast.LENGTH_SHORT).show();;

            }
        });



    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_csedata);
//
//        String url = "https://retoolapi.dev/HzTcrX/data";
//
////        ListView listView = (ListView) findViewById(R.id.listView);
//
////        ArrayList<String> arrNames = new ArrayList<String>();
////
////        AndroidNetworking.initialize(this);
////        AndroidNetworking.get(url)
////                .setPriority(Priority.HIGH)
////                .build()
////                .getAsJSONArray(new JSONArrayRequestListener() {
////                    @Override
////                    public void onResponse(JSONArray response) {
////                        Log.d("RES", response.toString());
////
////                        //parse
////                        try {
////                            for (int i = 0; i < response.length(); i++) {
////                                JSONObject obj = response.getJSONObject(i);
////                                String firstName = obj.getString("First name");
////                                String middleName = obj.getString("Middle name");
////                                String lastName = obj.getString("Last name");
////                                arrNames.add(firstName+" "+middleName +" "+lastName);
////
////                                ArrayAdapter<String> arrAdapter = new ArrayAdapter<String>(csedata.this, android.R.layout.simple_list_item_1,arrNames);
////                                listView.setAdapter(arrAdapter);
////                            }
////                        } catch (JSONException e) {
////                            e.printStackTrace();
////                        }
////                    }
////                    @Override
////                    public void onError(ANError anError) {
////                        anError.printStackTrace();
////                        Log.e("RES", anError.toString());
////                    }
////                });
////
////
////    }


}