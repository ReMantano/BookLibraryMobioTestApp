package com.example.booklibrarymobiotestapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.booklibrarymobiotestapp.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements ImageView.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton f = (ImageButton) findViewById(R.id.Fantasy);
        ImageButton fol = (ImageButton) findViewById(R.id.Tales);
        ImageButton d = (ImageButton) findViewById(R.id.Detective);
        ImageButton c = (ImageButton) findViewById(R.id.Novels);
        ImageButton t = (ImageButton) findViewById(R.id.Antiutopii);
        ImageButton j = (ImageButton) findViewById(R.id.Journey);

        f.setOnClickListener(this);
        fol.setOnClickListener(this);
        d.setOnClickListener(this);
        c.setOnClickListener(this);
        t.setOnClickListener(this);
        j.setOnClickListener(this);

        MobileAds.initialize(this,
                "ca-app-pub-3940256099942544~3347511713");

        AdView mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this,BookListActivity.class);
        String s = view.getContentDescription().toString();
        intent.putExtra("GENRE",s);

        startActivity(intent);
    }
}
