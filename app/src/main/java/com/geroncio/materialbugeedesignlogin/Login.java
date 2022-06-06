package com.geroncio.materialbugeedesignlogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageView = findViewById(R.id.logoImage);
        textView = findViewById(R.id.logo_name);

    }

    public void onLoginClick(View view){
        startActivity(new Intent(getApplicationContext(),Register.class));

    }
}