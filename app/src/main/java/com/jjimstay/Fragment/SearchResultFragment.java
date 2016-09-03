package com.jjimstay.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Date;
import java.util.List;

/**
 * Created by jacob on 2016-09-01.
 */
public class SearchResultFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    public interface OnSearchListener {
        void onCommonSearch(String query);

        void onCustomSearch(Date schedule, String addr1, String addr2, List<String> facility, String price);
    }
}
