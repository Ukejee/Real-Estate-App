package com.test.wourtonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    AppCompatButton loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Setting the AppTheme to display the activity
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.btn_login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, PropertySearchActivity.class);
                startActivity(intent);

            }
        });

    }
}
