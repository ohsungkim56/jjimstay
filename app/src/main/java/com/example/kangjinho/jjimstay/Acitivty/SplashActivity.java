package com.example.kangjinho.jjimstay.Acitivty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kangjinho.jjimstay.Fragment.SplashFragment;
import com.example.kangjinho.jjimstay.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if (savedInstanceState == null)
            getFragmentManager().beginTransaction().add(R.id.splashContainer, new SplashFragment()).commit();
    }
}
