package com.jjimstay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by jacob on 2016-08-27.
 */
public class LanguageArrayAdapter extends ArrayAdapter<String> {
    private int hidingItem;

    public LanguageArrayAdapter(Context context, int resource, int textViewResourceId, String[] objects, int hidingItem) {
        super(context, resource, textViewResourceId, objects);
        this.hidingItem = hidingItem;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        View v = super.getDropDownView(position, convertView, parent);
        if (position == hidingItem) {
            v.setVisibility(View.GONE);
        }
        return v;
    }
}
