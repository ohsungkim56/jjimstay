package com.example.kangjinho.jijim.Acitivty;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.kangjinho.jijim.Fragment.GPSFragment;
import com.example.kangjinho.jijim.Fragment.MainFragment;
import com.example.kangjinho.jijim.Fragment.SearchFragment;
import com.example.kangjinho.jijim.R;


public class MainActivity extends AppCompatActivity{

    private long backKeyPressedTime = 0;

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(Gravity.LEFT)) {
            drawer.closeDrawer(Gravity.LEFT);
        } else if (getFragmentManager().getBackStackEntryCount() > 0) {
            super.onBackPressed();
        } else { // back stack is 0 -> exit
            if (System.currentTimeMillis() - backKeyPressedTime > 1500) {
                backKeyPressedTime = System.currentTimeMillis();
                Toast.makeText(MainActivity.this, R.string.back_key_message, Toast.LENGTH_SHORT).show();
            } else {
                super.onBackPressed();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);

        ImageButton navigationButton = (ImageButton)findViewById(R.id.navigationMenuButton);
        navigationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });

        ImageButton searchButton = (ImageButton)findViewById(R.id.seachButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.mainContainer, new SearchFragment()).addToBackStack(null).commit();
            }
        });

        ImageButton GPSButton = (ImageButton)findViewById(R.id.GPSButton);
        GPSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.mainContainer, new GPSFragment()).addToBackStack(null).commit();
            }
        });

        if (savedInstanceState == null)
            getFragmentManager().beginTransaction().add(R.id.mainContainer, new MainFragment()).commit();
    }
}
