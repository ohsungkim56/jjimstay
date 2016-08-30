package com.jjimstay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Currency;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Public on 2016-07-20.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<Spa> mItems;
    private int item_layout;

    public RecyclerViewAdapter(Context mContext, List<Spa> items, int item_layout) {
        mItems = new LinkedList<Spa>();
        this.mContext = mContext;
        this.mItems = items;
        this.item_layout = item_layout;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_card, parent, false);
        return new ViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, int position) {
//        holder.backImage.setBackgroundResource(R.drawable.card_image1);
        Spa item = mItems.get(position);
        holder.name.setText(item.getName());
        holder.price.setText(" " + Currency.getInstance(Locale.KOREA).getSymbol() + ' ' + item.getPrice() + " ~ ");
        holder.location.setText(item.getLocation());
        holder.backImage.setBackgroundResource(item.getBackGroundImage());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //public ImageView mImageView;
        public RelativeLayout backImage;
        public TextView name;
        public TextView price;
        public TextView location;


        public ViewHolder(View itemView) {
            super(itemView);
            backImage = (RelativeLayout) itemView.findViewById(R.id.cardview_backImage);
            name = (TextView) itemView.findViewById(R.id.cardview_name);
            price = (TextView) itemView.findViewById(R.id.cardview_price);
            location = (TextView) itemView.findViewById(R.id.cardview_location);
        }
    }
}
