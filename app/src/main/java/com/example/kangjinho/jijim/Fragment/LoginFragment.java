package com.example.kangjinho.jijim.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kangjinho.jijim.R;

/**
 * Created by KangJinho on 2016-08-22.
 */
public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View layout = inflater.inflate(R.layout.fragment_login, container, false);
        ImageButton button = (ImageButton)layout.findViewById(R.id.startMain);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().beginTransaction().replace(R.id.container, new MainFragment()).commit();
            }
        });

        return layout;
    }
}
