package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView dangki;
    private Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dangki= (TextView) findViewById(R.id.gotoRegister);
        btLogin= (Button) findViewById(R.id.btnLogin);
        dangki.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMainActivity2();
            }
        });
        btLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v1){
                openMainActivity3();
            }
        });
    }
    public void openMainActivity2(){
        Intent intent = new Intent(this,Signup.class);
        startActivity(intent);
    }
    public void openMainActivity3(){
        Intent intent = new Intent(this,customlist.class);
        startActivity(intent);
    }

}