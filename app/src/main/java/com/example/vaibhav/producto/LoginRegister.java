package com.example.vaibhav.producto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginRegister extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);


    }
    public void login(View view){
        Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);

    }
    public void register(View view){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);

    }
    }


