package com.example.booklibrarymobiotestapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.booklibrarymobiotestapp.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class BookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Intent intent = getIntent();

        ImageView image = (ImageView) findViewById(R.id.imageView);
        TextView text = (TextView) findViewById(R.id.bookDescrip);

        image.setImageResource(intent.getIntExtra("IMAGE",0));
        text.setText(intent.getStringExtra("DESK"));

        AdView mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
