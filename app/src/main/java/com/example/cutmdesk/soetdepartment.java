package com.example.cutmdesk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class soetdepartment extends AppCompatActivity {

    ImageView  CSEDEPT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soetdepartment);

        CSEDEPT = (ImageView) findViewById(R.id.CSEDEPT);

        CSEDEPT.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent csedata = new Intent(soetdepartment.this, com.example.cutmdesk.csedata.class);
                startActivity(csedata);
            }
        });


    }






}