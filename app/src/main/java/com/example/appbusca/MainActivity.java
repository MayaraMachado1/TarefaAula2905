package com.example.appbusca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1OnClick(View v){

        Intent intent = new Intent(this, Email.class);
        startActivity(intent);
    }

    public void btn2nClick(View v){

        Intent intent = new Intent(this, Telefone.class);
        startActivity(intent);
    }

    public void btn3OnClick(View v){

        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}


