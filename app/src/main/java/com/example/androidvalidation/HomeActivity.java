package com.example.androidvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView resultName = findViewById(R.id.home_name);
        TextView resultEmail = findViewById(R.id.home_email);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name_is");
        String email = intent.getStringExtra("email_is");
        resultName.setText("Welcome" + name + "!");
        resultEmail.setText("email is" + email);


    }

}