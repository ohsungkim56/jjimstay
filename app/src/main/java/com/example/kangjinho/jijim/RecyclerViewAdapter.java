package com.example.kangjinho.jijim;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Public on 2016-07-20.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private List<DataList> mItems;
    private int item_layout;

    public RecyclerViewAdapter(Context mContext, List<DataList> items, int item_layout) {
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
//        DataList item = mItems.get(position);
        holder.backImage.setBackgroundResource(R.drawable.card_image1);
       // holder.name.setText("Dragon Hill Spa & Resort");
        //holder.price.setText("8000~");
        //holder.mImageView.setBackgroundResource(item.getImage());
    }

    @Override
    public int getItemCount() {
     // return mItems.size();
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        //public ImageView mImageView;
        public FrameLayout backImage;
        public TextView name;
        public TextView price;


        public ViewHolder(View itemView) {
            super(itemView);
            backImage = (FrameLayout) itemView.findViewById(R.id.backImage);
           // name = (TextView)itemView.findViewById(R.id.name);
           //
            // price = (TextView)itemView.findViewById(R.id.price);
        }
    }
}
