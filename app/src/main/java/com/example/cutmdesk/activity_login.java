package com.example.cutmdesk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class activity_login extends AppCompatActivity {

    Button loginbtn;

    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://cutm-deandesk-default-rtdb.firebaseio.com/");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        final EditText username = findViewById(R.id.userid);
        final EditText password = findViewById(R.id.password);
        final Button LoginBtn = findViewById(R.id.loginbtn);

        loginbtn = findViewById(R.id.loginbtn);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String usernameTxt = username.getText().toString();
                final String PasswordTxt = password.getText().toString();

                if (usernameTxt.isEmpty() || PasswordTxt.isEmpty()) {
                    Toast.makeText(activity_login.this, "Please enter your Username and Password", Toast.LENGTH_SHORT).show();
                } else {

                    databaseReference.child("users").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {

                            //check if email is existing in the db
                            if (snapshot.hasChild(usernameTxt)) {

                                final String getpassword = snapshot.child(usernameTxt).child("password").getValue(String.class);

                                if (getpassword.equals(PasswordTxt)) {
                                    Toast.makeText(activity_login.this, "Successfully Logged in", Toast.LENGTH_SHORT).show();

                                    //Starting student form
                                    startActivity(new Intent(activity_login.this,MainActivity.class));
                                    finish();
                                } else {
                                    Toast.makeText(activity_login.this, "Wrong Credentials", Toast.LENGTH_SHORT).show();
                                }

                            }
//
                        }


                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });

                }
                ////////////////////////////////////////////////////////////////////////////////
//                databaseReference.child("admin").addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//
//                        //check if email is existing in the db
//                        if (snapshot.hasChild(usernameTxt)) {
//
//                            final String getpassword = snapshot.child(usernameTxt).child("password").getValue(String.class);
//
//                            if (getpassword.equals(PasswordTxt)) {
//                                Toast.makeText(login.this, "Successfully Logged in admin panel", Toast.LENGTH_SHORT).show();
//
//                                //Starting student form
//                                startActivity(new Intent(login.this, Adminpage.class));
//                                finish();
//                            }
////                                                      Toast.makeText(login.this," ",Toast.LENGTH_SHORT).show();
//                            else {
//                                Toast.makeText(login.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
//                            }
//                        }
////
//                    }
//
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//                });
                ////////////////////////////////////////////////////////////////////////////////
            }
        });
    }
}