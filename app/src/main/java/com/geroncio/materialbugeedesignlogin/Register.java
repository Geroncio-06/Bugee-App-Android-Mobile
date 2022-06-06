package com.geroncio.materialbugeedesignlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onLoginClick(View view){
        overridePendingTransition(0,0);
        startActivity(new Intent(getApplicationContext(),Login.class));
        overridePendingTransition(0,0);
        finish();
    }
}