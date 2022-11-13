package com.example.cutmdesk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class csedata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csedata);

        String url = "https://retoolapi.dev/HzTcrX/data";

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<String> arrNames = new ArrayList<String>();

        AndroidNetworking.initialize(this);
        AndroidNetworking.get(url)
                .setPriority(Priority.HIGH)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d("RES", response.toString());

                        //parse
                        try {
                            for (int i = 0; i < response.length(); i++) {
                                JSONObject obj = response.getJSONObject(i);
                                String name = obj.getString("First name");

                                arrNames.add(name);

                                ArrayAdapter<String> arrAdapter = new ArrayAdapter<String>(csedata.this, android.R.layout.simple_list_item_1,arrNames);
                                listView.setAdapter(arrAdapter);

                            }


                        } catch (JSONException e) {
                            e.printStackTrace();
                        }


                    }

                    @Override
                    public void onError(ANError anError) {
                        anError.printStackTrace();
                        Log.e("RES", anError.toString());
                    }
                });


    }


}