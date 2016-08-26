package com.example.kangjinho.jijim.Acitivty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kangjinho.jijim.Fragment.MainFragment;
import com.example.kangjinho.jijim.R;


public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null)
            getFragmentManager().beginTransaction().add(R.id.mainContainer, new MainFragment()).commit();

    }

}
