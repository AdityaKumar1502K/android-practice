package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = findViewById(R.id.txt_inp);
    }
    public void showText(View v){
        Toast.makeText(this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}