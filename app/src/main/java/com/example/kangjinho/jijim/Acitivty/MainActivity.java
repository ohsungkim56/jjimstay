package com.example.kangjinho.jijim.Acitivty;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;

import com.example.kangjinho.jijim.Fragment.MainFragment;
import com.example.kangjinho.jijim.R;


public class MainActivity extends AppCompatActivity{

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        if(drawer.isDrawerOpen(Gravity.LEFT)){
            drawer.closeDrawer(Gravity.LEFT);
        } else {
            super.onBackPressed();
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
                // 프래그먼트 변경
//                getFragmentManager().beginTransaction().replace(R.id.mainContainer, new SearchFragment()).commit();
            }
        });

        ImageButton GPSButton = (ImageButton)findViewById(R.id.GPSButton);
        GPSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 프래그먼트 변경
//                getFragmentManager().beginTransaction().replace(R.id.mainContainer, new GPSFragment()).commit();
            }
        });

        if (savedInstanceState == null)
            getFragmentManager().beginTransaction().add(R.id.mainContainer, new MainFragment()).commit();
    }
}
