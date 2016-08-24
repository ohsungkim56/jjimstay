package com.example.kangjinho.jijim.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kangjinho.jijim.DataList;
import com.example.kangjinho.jijim.R;
import com.example.kangjinho.jijim.RecyclerViewAdapter;

import java.util.List;

/**
 * Created by KangJinho on 2016-08-22.
 */
public class MainFragment extends Fragment {

    private List<DataList> dataList;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View layout = inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView.Adapter mAdapter;

        RecyclerView mRecyclerView = (RecyclerView) layout.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(layout.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerViewAdapter(layout.getContext(), dataList, R.layout.fragment_card);
        mRecyclerView.setAdapter(mAdapter);
        return layout;
    }
}
