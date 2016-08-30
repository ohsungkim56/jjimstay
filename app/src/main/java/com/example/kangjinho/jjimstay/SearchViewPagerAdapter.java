package com.example.kangjinho.jjimstay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.kangjinho.jjimstay.Fragment.CommonSearchFragment;
import com.example.kangjinho.jjimstay.Fragment.CustomSearchFragment;

/**
 * Created by jacob on 2016-08-28.
 */
public class SearchViewPagerAdapter extends FragmentStatePagerAdapter {

    private int tabCount;

    public SearchViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CommonSearchFragment();
            case 1:
                return new CustomSearchFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
