package com.example.kangjinho.jijim.Acitivty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kangjinho.jijim.Fragment.SplashFragment;
import com.example.kangjinho.jijim.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if (savedInstanceState == null)
            getFragmentManager().beginTransaction().add(R.id.splashContainer, new SplashFragment()).commit();


    }


}
