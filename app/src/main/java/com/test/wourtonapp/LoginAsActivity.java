package com.test.wourtonapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginAsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_as);
    }

    public void onClickGuest(View view){

        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }

    public void onClickStaff(View view){

        Intent propertyRequestIntent = new Intent(this, PropertyRequestActivity.class);
        startActivity(propertyRequestIntent);
    }
}
