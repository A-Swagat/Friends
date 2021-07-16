package com.swagat.friends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread th = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(1000);

                }catch (Exception e){
                    Toast.makeText(SplashScreen.this,"something went worong",Toast.LENGTH_LONG);
                }
                finally {
                    Intent i1 = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(i1);
                }
                super.run();
            }

        };
        th.start();

    }
}