package com.example.booklibrarymobiotestapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.booklibrarymobiotestapp.R;
import com.example.booklibrarymobiotestapp.book.ListBook;

import java.util.ArrayList;


/**
 * Created by Vladislav on 09.07.2018.
 */

public class BookListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    private int TEXT_TYPE = 1, AD_TYPE = 0;

    ArrayList<ListBook> list;
    View.OnClickListener listener;

    public BookListAdapter(ArrayList<ListBook> list, View.OnClickListener listener){

        this.list = list;
        this.listener = listener;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == TEXT_TYPE){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book,parent,false);
            BookListViewHolder book = new BookListViewHolder(v,listener);
            return book;
        }else{
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ad,parent,false);
            ViewHolderAd book = new ViewHolderAd(v);
            return book;
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        if (holder.getItemViewType() == TEXT_TYPE) {
            ((BookListViewHolder) holder).nameBook.setText(list.get(position).getNameBook());
            ((BookListViewHolder) holder).nameAuthor.setText(list.get(position).getNameAuthor());
            ((BookListViewHolder) holder).image.setImageResource(list.get(position).getImage());
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {

        int type;

        if (list.get(position) != null) type = TEXT_TYPE;
        else type = AD_TYPE;

        return type;
    }
}
