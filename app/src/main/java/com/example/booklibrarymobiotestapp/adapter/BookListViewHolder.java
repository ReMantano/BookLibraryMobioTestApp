package com.example.booklibrarymobiotestapp.adapter;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.booklibrarymobiotestapp.R;

/**
 * Created by Vladislav on 09.07.2018.
 */

public  class BookListViewHolder extends RecyclerView.ViewHolder {

    TextView nameBook,nameAuthor;
    ImageView image;

    public BookListViewHolder(View itemView, CardView.OnClickListener list) {
        super(itemView);
        nameBook = (TextView) itemView.findViewById(R.id.bookName);
        nameAuthor = (TextView) itemView.findViewById(R.id.authorName);
        image = (ImageView) itemView.findViewById(R.id.imageBook);
        itemView.setOnClickListener(list);
    }


}
