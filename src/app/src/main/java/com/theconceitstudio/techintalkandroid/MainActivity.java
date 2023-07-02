package com.theconceitstudio.techintalkandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.theconceitstudio.techintalkandroid.activitydatapass.SecondActivity;


public class MainActivity extends AppCompatActivity {

    private Button passData;
    private Activity currentActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentActivity = this;

        passData = findViewById(R.id.passData);
        passData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(currentActivity, SecondActivity.class);
                intent.putExtra("userName", "This is reandom name");
                startActivity(intent);

            }
        });

    }
}