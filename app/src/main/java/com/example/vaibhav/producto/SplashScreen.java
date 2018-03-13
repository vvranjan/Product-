package com.example.vaibhav.producto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by vaibhav on 28-Feb-18.
 */

public class SplashScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread myThread = new Thread()
        {
            public void run()
            {
                try {
                    sleep(3000);
                    Intent intent =new Intent(getApplicationContext(),LoginRegister.class);
                    startActivity(intent);
                    finish();
                }catch (InterruptedException e){
                    e.printStackTrace();}
                }
            };
                myThread.start();
        }
    }

