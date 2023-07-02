package com.theconceitstudio.techintalkandroid.activitydatapass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.theconceitstudio.techintalkandroid.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconda);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");

        Toast.makeText(this, userName, Toast.LENGTH_SHORT).show();

    }
}