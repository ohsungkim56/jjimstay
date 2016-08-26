package com.example.kangjinho.jijim.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kangjinho.jijim.DataList;
import com.example.kangjinho.jijim.R;
import com.example.kangjinho.jijim.RecyclerViewAdapter;
import com.example.kangjinho.jijim.RecyclerViewOnItemClickListener;

import java.util.List;

public class MainFragment extends Fragment {

    private List<DataList> dataList;
    private DrawerLayout mDrawerLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView.Adapter mAdapter;


        RecyclerView mRecyclerView = (RecyclerView) layout.findViewById(R.id.mainRecyclerView);
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

        mAdapter = new RecyclerViewAdapter(layout.getContext(), dataList, R.layout.fragment_card);
        mRecyclerView.setAdapter(mAdapter);

        return layout;
    }


}
