package com.jjimstay.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.jjimstay.R;
import com.jjimstay.SearchViewPagerAdapter;

/**
 * Created by jacob on 2016-08-28.
 */
public class SearchFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_search, null);
        TabLayout tb = (TabLayout) layout.findViewById(R.id.search_tablayout);
        tb.setSelectedTabIndicatorHeight(0); // indicator remove
        final ViewPager vp = (ViewPager) layout.findViewById(R.id.search_viewpager);


        SearchViewPagerAdapter adapter = new SearchViewPagerAdapter(((AppCompatActivity) getActivity()).getSupportFragmentManager(), tb.getTabCount());
        vp.setAdapter(adapter);

        vp.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tb));
        tb.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        return layout;
    }
}
