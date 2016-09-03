package com.jjimstay.Acitivty;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.jjimstay.Fragment.GPSFragment;
import com.jjimstay.Fragment.InfoFragment;
import com.jjimstay.Fragment.MainFragment;
import com.jjimstay.Fragment.SearchFragment;
import com.jjimstay.Fragment.SearchResultFragment;
import com.jjimstay.R;
import com.jjimstay.Spa;

import java.util.Date;
import java.util.List;


public class MainActivity extends AppCompatActivity implements MainFragment.OnSpaSelectedListener, SearchResultFragment.OnSearchListener {

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

        ImageButton sideBarButton = (ImageButton) findViewById(R.id.sideBarButton);
        sideBarButton.setOnClickListener(new View.OnClickListener() {
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

        getFragmentManager().beginTransaction().replace(R.id.mainContainer, new MainFragment()).commit();
    }

    @Override
    public void onSpaSelected(Spa spa) {
        InfoFragment infoFragment = new InfoFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SPA", spa);
        infoFragment.setArguments(bundle);

        getFragmentManager().beginTransaction().replace(R.id.mainContainer, infoFragment).addToBackStack(null).commit();
    }

    @Override
    public void onCommonSearch(String query) {
        SearchResultFragment resultFragment = new SearchResultFragment();
        Bundle bundle = new Bundle();
        bundle.putString("QUERY", query);
        resultFragment.setArguments(bundle);

        getFragmentManager().beginTransaction().replace(R.id.mainContainer, resultFragment).addToBackStack(null).commit();
    }

    @Override
    public void onCustomSearch(Date schedule, String addr1, String addr2, List<String> facility, String price) {
        SearchResultFragment resultFragment = new SearchResultFragment();
//        Bundle bundle = new Bundle();
//        bundle.putParcelable("query", spa);
//        resultFragment.setArguments(bundle);

        getFragmentManager().beginTransaction().replace(R.id.mainContainer, resultFragment).addToBackStack(null).commit();
    }
}
