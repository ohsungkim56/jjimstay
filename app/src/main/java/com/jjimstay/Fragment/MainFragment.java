package com.jjimstay.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jjimstay.R;
import com.jjimstay.RecyclerViewAdapter;
import com.jjimstay.RecyclerViewOnItemClickListener;
import com.jjimstay.Spa;

import java.util.LinkedList;
import java.util.List;

public class MainFragment extends Fragment {
    public OnSpaSelectedListener mSpaSelectedListener = null;
    private List<Spa> spaList;

    @Override
    public void onStart() {
        super.onStart();
        mSpaSelectedListener = (OnSpaSelectedListener) this.getActivity();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mSpaSelectedListener = (OnSpaSelectedListener) this.getActivity();
    }

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
                mSpaSelectedListener.onSpaSelected(spaList.get(position));
            }

            @Override
            public void onItemLongClick(View v, int position) {
            }
        }
        ));

        setSpaList(); // test용 데이터 세팅

        return layout;
    }

    public void setSpaList() { // test 용!!!
        spaList.add(new Spa(R.drawable.card_image1_test, "TEST데이터1", "11111", "TEST주소1"));
        spaList.add(new Spa(R.drawable.card_image2_test, "TEST데이터2", "22222", "TEST주소2"));
        spaList.add(new Spa(R.drawable.card_image1_test, "TEST데이터3", "33333", "TEST주소3"));
        spaList.add(new Spa(R.drawable.card_image2_test, "TEST데이터4", "44444", "TEST주소4"));
        spaList.add(new Spa(R.drawable.card_image1_test, "TEST데이터5", "55555", "TEST주소5"));
        spaList.add(new Spa(R.drawable.card_image2_test, "TEST데이터6", "66666", "TEST주소6"));
    }

    public interface OnSpaSelectedListener {
        void onSpaSelected(Spa spa);
    }
}