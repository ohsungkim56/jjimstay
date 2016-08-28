package com.example.kangjinho.jijim.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kangjinho.jijim.R;
import com.example.kangjinho.jijim.RecyclerViewAdapter;
import com.example.kangjinho.jijim.RecyclerViewOnItemClickListener;
import com.example.kangjinho.jijim.Spa;

import java.util.LinkedList;
import java.util.List;

public class MainFragment extends Fragment {

    private List<Spa> spaList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        spaList = new LinkedList<Spa>();
        View layout = inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView.Adapter mAdapter;
        mAdapter = new RecyclerViewAdapter(layout.getContext(), spaList, R.layout.fragment_card);

        RecyclerView mRecyclerView = (RecyclerView) layout.findViewById(R.id.mainRecyclerView);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(layout.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.addOnItemTouchListener(new RecyclerViewOnItemClickListener(getActivity(), mRecyclerView, new RecyclerViewOnItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View v, final int position) {
                getFragmentManager().beginTransaction().replace(R.id.mainContainer, new InfoFragment()).addToBackStack(null).commit();
            }

            @Override
            public void onItemLongClick(View v, int position) {
            }
        }
        ));

        setSpaList();

        return layout;
    }

    public void setSpaList() { // test func
        spaList.add(new Spa(R.drawable.card_image1_test, "TEST데이터1", "11111", "TEST주소1"));
        spaList.add(new Spa(R.drawable.card_image2_test, "TEST데이터2", "22222", "TEST주소2"));
    }
}