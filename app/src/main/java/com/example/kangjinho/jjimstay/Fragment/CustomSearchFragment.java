package com.example.kangjinho.jjimstay.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kangjinho.jjimstay.R;

/**
 * Created by jacob on 2016-08-28.
 */
public class CustomSearchFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_custom_search, null);
//        Spinner scheduleSpinner = (Spinner)v.findViewById(R.id.schedule_spinner);
//        Spinner addr1 = (Spinner)v.findViewById(R.id.addr_spinner1);
//        Spinner addr2 = (Spinner)v.findViewById(R.id.addr_spinner2);

        return v;
    }
}
