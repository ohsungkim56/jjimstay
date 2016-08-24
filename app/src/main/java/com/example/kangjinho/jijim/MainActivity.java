package com.example.kangjinho.jijim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.kangjinho.jijim.Fragment.SplashFragment;

/**
 * Created by KangJinho on 2016-08-22.
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getFragmentManager().beginTransaction().add(R.id.container, new SplashFragment()).commit();

    }
/*
    private void setCustomActionbar(){
        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        View mCustomView = LayoutInflater.from(this).inflate(R.layout.activity_actionbar, null);
        //actionBar.setCustomView(mCustomView);

        //Toolbar parent = (Toolbar)mCustomView.getParent();
        //parent.setContentInsetsAbsolute(0, 0);


        ActionBar.LayoutParams params = new ActionBar.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        actionBar.setCustomView(mCustomView, params);
    }*/
}
