package com.example.myapplication2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final EditText inputText = findViewById(R.id.editText);
        final TextView outputText = findViewById(R.id.textView);
        Button Add = findViewById(R.id.bt_add);
        Button Save = findViewById(R.id.bt_save);

        Add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String Value = inputText.getText().toString();
                outputText.setText(Value);




        }
    });
        Save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                String Data = outputText.getText().toString();
                Intent intent = new Intent(HomeActivity.this, MessageActivity.class);
                intent.putExtra("abc", Data);
                startActivity(intent);
                finish();

            }

            });


                                }



    }

