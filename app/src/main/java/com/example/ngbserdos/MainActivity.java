package com.example.ngbserdos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btnHitungactivity;
Button btnAboutActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHitungactivity = findViewById(R.id.btn_hitung_activity);
        btnHitungactivity.setOnClickListener(this);
        btnAboutActivity = findViewById(R.id.btn_about_activity);
        btnAboutActivity.setOnClickListener(this);
    }
    public void onClick (View v) {
        switch (v.getId()) {
            case R.id.btn_hitung_activity:
                Intent moveIntentHitung = new Intent(MainActivity.this, hitung_activity.class);
                startActivity(moveIntentHitung);
                break;
            case R.id.btn_about_activity:
                Intent moveIntentAbout = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntentAbout);
                break;
        }
    }
}
