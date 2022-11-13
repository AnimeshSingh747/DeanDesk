package com.example.cutmdesk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.api.Http;
import com.google.common.base.Utf8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class csedata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csedata);

        readStudentData();
    }

    private List<StudentReg> studentRegs = new ArrayList<>();
    private void readStudentData() {
//        StudentReg reg;
        InputStream is = getResources().openRawResource(R.raw.studentdata);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = "";
        while (true) {
            try {
                if (!((line = reader.readLine()) != null)) break;
                String[] tokens = line.split(",");

                StudentReg reg = new StudentReg();
                reg.setAdmissionnumber(tokens[0]);
                reg.setRollno(Double.parseDouble(tokens[1]));
                reg.setFirstname(tokens[2]);
                reg.setLastname(tokens[3]);
                reg.setUniqueid(Integer.parseInt(tokens[4]));
                reg.setClasss(tokens[5]);
                reg.setSemester(tokens[6]);
                reg.setContactno(Double.parseDouble(tokens[7]));
                studentRegs.add(reg);

                Log.d("MyActivity", "Student information" + reg);


            }
            catch (IOException e) {
                Log.wtf("MyActivity","Error reading data file on line" + line, e);
                e.printStackTrace();
            }

        }
    }


}