package com.theconceitstudio.techintalkandroid.buttonclicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.theconceitstudio.techintalkandroid.R;

public class TextGetFromFieldActivity extends AppCompatActivity {

    private EditText textInput;
    private Button updateBtn;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_get_from_field);

        // binding veriables to the layout file
        textInput = findViewById(R.id.textInput);
        updateBtn = findViewById(R.id.updateBtn);
        text = findViewById(R.id.text);

        // add click listner
        updateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get text from edit view
                String inputText = textInput.getText().toString();
                // set that text to the textview
                text.setText(inputText);
            }
        });
    }
}