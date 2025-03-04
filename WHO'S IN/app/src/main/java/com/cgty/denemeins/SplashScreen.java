package com.cgty.denemeins;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * The "App Loading..." screen.
 *
 * @author Cagatay Safak
 * @version 1.0
 */
public class SplashScreen extends AppCompatActivity {
    
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_splash_screen);
        
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intentFromSplashToMain;
                intentFromSplashToMain = new Intent(SplashScreen.this, MainActivity.class);
                
                startActivity(intentFromSplashToMain);
                
                finish();
            }
        }, 2000);
    }
}