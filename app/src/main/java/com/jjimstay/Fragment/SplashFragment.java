package com.jjimstay.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;

import com.jjimstay.LanguageArrayAdapter;
import com.jjimstay.R;

/**
 * Created by KangJinho on 2016-08-22.
 */
public class SplashFragment extends Fragment {
    private Spinner mSpinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_spinner, container, false);

        String[] languages = getResources().getStringArray(R.array.language);
        mSpinner = (Spinner) layout.findViewById(R.id.spinnerLanguage);
        LanguageArrayAdapter adapter = new LanguageArrayAdapter(getActivity().getApplicationContext(), R.layout.language_spinner_item, R.id.Language_Item_textView, languages, 0);
        mSpinner.setAdapter(adapter);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 1: // korean
                        getFragmentManager().beginTransaction().replace(R.id.splashContainer, new LoginFragment()).commit();
                        break;
                    case 2: // english
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