package com.example.booklibrarymobiotestapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.booklibrarymobiotestapp.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Vladislav on 10.07.2018.
 */

public class ViewHolderAd extends RecyclerView.ViewHolder {
    public ViewHolderAd(View itemView) {
        super(itemView);

        AdRequest adRequest = new AdRequest.Builder().build();
        AdView mAdView = (AdView) itemView.findViewById(R.id.adList);
        mAdView.loadAd(adRequest);
    }
}
