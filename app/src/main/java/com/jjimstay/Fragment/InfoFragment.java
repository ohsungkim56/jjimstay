package com.jjimstay.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jjimstay.InfoViewPagerAdapter;
import com.jjimstay.R;
import com.jjimstay.Spa;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KangJinho on 2016-08-24.
 */
public class InfoFragment extends Fragment {

    static final String TAG = "INFOFRAGMENT";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View layout = inflater.inflate(R.layout.fragment_info, container, false);

        try { // load Spa data
            Spa spa = getArguments().getParcelable("SPA");

            // 테스트 중....
            ViewPager pager = (ViewPager) layout.findViewById(R.id.info_viewpager);
            List<Integer> resources = new ArrayList<>();
            resources.add(spa.getBackGroundImage());
            resources.add(spa.getBackGroundImage());
            resources.add(spa.getBackGroundImage());
            InfoViewPagerAdapter adapter = new InfoViewPagerAdapter(resources, getActivity().getApplicationContext());
            pager.setAdapter(adapter);


            //detail tab
            TextView nameTextView = (TextView) layout.findViewById(R.id.details_name_textView);
//            TextView rating_tv = (TextView)layout.findViewById(R.id.details_rating_textView);
//            ImageView rating_imgView = (ImageView)layout.findViewById(R.id.details_star_imgView);
            nameTextView.setText(spa.getName());


            return layout;
        } catch (Exception e) {
            Log.d(TAG, e.toString());
        } finally {
            return layout;
        }
    }
}
