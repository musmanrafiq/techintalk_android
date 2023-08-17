package com.theconceitstudio.techintalkandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.theconceitstudio.techintalkandroid.buttonclicks.TextGetFromFieldActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // open Text get from field activity
        Intent intent = new Intent(DashboardActivity.this, TextGetFromFieldActivity.class);
        this.startActivity(intent);
    }
}