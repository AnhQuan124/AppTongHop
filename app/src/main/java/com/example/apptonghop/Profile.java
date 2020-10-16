package com.example.apptonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private Button dangxuat;
    private ImageView music2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        dangxuat = (Button) findViewById(R.id.btLogout);
        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity4();
            }
        });
        music2 = (ImageView) findViewById(R.id.music);
        music2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencustomlist();
            }
        });
    }

    public void openMainActivity4() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void opencustomlist() {
        Intent intent = new Intent(this, customlist.class);
        startActivity(intent);
    }
}