package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    private TextView dangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        dangnhap= (TextView) findViewById(R.id.gotologin);
        dangnhap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity3();
            }
        });
    }
    public void openMainActivity3(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}