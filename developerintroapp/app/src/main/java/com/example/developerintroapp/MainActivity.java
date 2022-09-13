package com.example.developerintroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button learn_more;
    private TextView info_text;
    private EditText name_entry;
    String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        learn_more = findViewById(R.id.learnMore_button_main);
        info_text  = findViewById(R.id.info_txt_main);
        name_entry = findViewById(R.id.edit_txt_main);

        learn_more.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                name = name_entry.getText().toString();
                info_text.setText(name);
            }
        });

        info_text.setText("Testing");
    }
}