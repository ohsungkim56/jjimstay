package com.example.kangjinho.jjimstay.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kangjinho.jjimstay.R;
import com.example.kangjinho.jjimstay.Spa;

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

            ViewPager pager = (ViewPager) layout.findViewById(R.id.search_viewpager);

            //detail tab
            TextView name_tv = (TextView) layout.findViewById(R.id.details_name_textView);
//            TextView rating_tv = (TextView)layout.findViewById(R.id.details_rating_textView);
//            ImageView rating_imgView = (ImageView)layout.findViewById(R.id.details_star_imgView);
            name_tv.setText(spa.getName());


            return layout;
        } catch (Exception e) {
            Log.d(TAG, e.toString());
        } finally {
            return layout;
        }

    }
}
