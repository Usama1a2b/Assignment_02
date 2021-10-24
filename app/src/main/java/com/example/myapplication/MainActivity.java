package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText txtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                EditText txtname = findViewById(R.id.editTextTextPersonName);
                String name =  txtname.getText().toString();
                char character = name.charAt(0);
                int name_int =(int) character;

                    if (name_int>96 && name_int<123){
                        button.setText(name);

                }

            }
        });

    };
}