package com.padcmyanmar.mmnews.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.padcmyanmar.mmnews.R;
import com.padcmyanmar.mmnews.viewholders.ItemNewsViewHolder;

/**
 * Created by Ag Phone Khant on 3/12/2017.
 */

public class NewsAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater= LayoutInflater.from(context);
       View newsItemView =  inflater.inflate(R.layout.item_news,parent,false);
        ItemNewsViewHolder itemNewsViewHolder = new ItemNewsViewHolder(newsItemView);
        return itemNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 16;
    }
}
