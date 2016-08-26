package com.example.kangjinho.jijim.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.example.kangjinho.jijim.R;

/**
 * Created by KangJinho on 2016-08-22.
 */
public class SplashFragment extends Fragment {
    private Spinner mSpinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_spinner, container, false);

        mSpinner = (Spinner) layout.findViewById(R.id.spinnerLanguage);



        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Log.v("머이ㅑ", i+"");
                switch (i) {
                    case 1:
                        getFragmentManager().beginTransaction().replace(R.id.splashContainer, new LoginFragment()).commit();
                        break;
                    case 2:
                        getFragmentManager().beginTransaction().replace(R.id.splashContainer, new LoginFragment()).commit();
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return layout;
    }

}