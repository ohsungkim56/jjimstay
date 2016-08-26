package com.example.kangjinho.jijim.Fragment;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.kangjinho.jijim.Acitivty.MainActivity;
import com.example.kangjinho.jijim.R;

/**
 * Created by KangJinho on 2016-08-22.
 */
public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_login, container, false);
        Button button = (Button)layout.findViewById(R.id.startMain);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity() , MainActivity.class));
                getFragmentManager().beginTransaction().remove(new LoginFragment());
                getActivity().finish();
            }
        });

        return layout;
    }
}
