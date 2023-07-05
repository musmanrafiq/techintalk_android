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
        // receive data send by calling activity
        Intent intent = getIntent();
        // receive simple data type
        String userName = intent.getStringExtra("userName");
        int userId = intent.getIntExtra("userId", 0);
        // pull complex object from the intent
        UserModel userModel = (UserModel) intent.getSerializableExtra("userDetail");
        // show value on toast
        Toast.makeText(this, "User Id is : "+userModel.UserId +" and the name is : "+ userModel.UserName, Toast.LENGTH_SHORT).show();
    }
}