package com.example.first_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity4 extends AppCompatActivity implements View.OnClickListener {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu4);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnBack) {
            Intent main_menu = new Intent(this, MenuActivity.class);
            startActivity(main_menu);
        }
    }
}
