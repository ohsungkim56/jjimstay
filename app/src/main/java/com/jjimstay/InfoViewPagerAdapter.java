package com.jjimstay;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by jacob on 2016-08-31.
 */
public class InfoViewPagerAdapter extends PagerAdapter {

    List<Integer> resources;
    LayoutInflater inflater;


    public InfoViewPagerAdapter(List<Integer> resources, Context c) {
        super();
        this.resources = resources;
        this.inflater = LayoutInflater.from(c);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View v = null;
        v = inflater.inflate(R.layout.info_viewpager, null);
        ImageView iv = (ImageView) v.findViewById(R.id.info_viewPager_ImageView);
        iv.setImageResource(resources.get(position));
        ((ViewPager) container).addView(v, 0);
        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }

    @Override
    public int getCount() {
        return resources.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
