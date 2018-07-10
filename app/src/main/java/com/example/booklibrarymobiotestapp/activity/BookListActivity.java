package com.example.booklibrarymobiotestapp.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.booklibrarymobiotestapp.adapter.BookListAdapter;
import com.example.booklibrarymobiotestapp.R;
import com.example.booklibrarymobiotestapp.book.Antiutopii;
import com.example.booklibrarymobiotestapp.book.Detective;
import com.example.booklibrarymobiotestapp.book.Fantasy;
import com.example.booklibrarymobiotestapp.book.Journey;
import com.example.booklibrarymobiotestapp.book.ListBook;
import com.example.booklibrarymobiotestapp.book.Novel;
import com.example.booklibrarymobiotestapp.book.Tales;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.util.ArrayList;

public class BookListActivity extends AppCompatActivity implements View.OnClickListener,RewardedVideoAdListener {

    private  int IMAGE_ID;
    private  String DESK;
    private boolean key = false;

    private RecyclerView rec;
    private BookListAdapter adapter;
    private ArrayList<ListBook> book ;
    private  InterstitialAd inAd;
    private RewardedVideoAd rewAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);


        String genre = getIntent().getStringExtra("GENRE");


        switch(genre){

            case "Antiutopii": {
                Antiutopii a = new Antiutopii();
                a.initilalizedData();
                book = a.getArray();
                break;
            }
            case "Tales": {
                Tales a = new Tales();
                a.initilalizedData();
                book = a.getArray();
                break;
            }
            case "Detective": {
                Detective a = new Detective();
                a.initilalizedData();
                book = a.getArray();
                break;
            }
            case "Journey": {
                Journey a = new Journey();
                a.initilalizedData();
                book = a.getArray();
                break;
            }
            case "Fantasy": {
                Fantasy a = new Fantasy();
                a.initilalizedData();
                book = a.getArray();
                break;
            }
            case "Novels": {
                Novel a = new Novel();
                a.initilalizedData();
                book = a.getArray();
                break;
            }

        }

        inAd = new InterstitialAd(this);
        inAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        inAd.loadAd(new AdRequest.Builder().build());

        MobileAds.initialize(this,"ca-app-pub-3940256099942544/5224354917");
        rewAd = MobileAds.getRewardedVideoAdInstance(this);
        rewAd.setRewardedVideoAdListener(this);
        rewAd.loadAd("ca-app-pub-3940256099942544/5224354917",new AdRequest.Builder().build());

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        adapter = new BookListAdapter(book,this);

        rec = findViewById(R.id.listView);
        rec.setLayoutManager(llm);
        rec.setAdapter(adapter);




    }


    @Override
    public void onClick(View view) {
        TextView nameBook = (TextView) view.findViewById(R.id.authorName);

        int index = searchSource(book,nameBook.getText().toString());

        if (inAd.isLoaded() && (index < book.size() - 6)) inAd.show();

        Intent intent = new Intent(this,BookActivity.class);


        if ((index < book.size() - 6) || key)  {
            intent.putExtra("IMAGE", book.get(index).getImage());
            intent.putExtra("DESK", book.get(index).getDesk());

            startActivity(intent);
        }else{

            DESK = book.get(index).getDesk();
            IMAGE_ID = book.get(index).getImage();

            Alert();
        }
    }

    private int searchSource(ArrayList<ListBook> list, String name){
        for (int i = 0; i < list.size();i++){

            if (list.get(i) != null) {
                if (name == list.get(i).getNameAuthor()) return i;
            }
        }
        return 0;
    }


    private void Alert(){

        AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle("Внимание!");
        alert.setMessage("Для просмотра книги вы должны  посмотреть видеорекламу");
        alert.setPositiveButton("Просмотреть", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(rewAd.isLoaded()){
                    rewAd.show();
                }
            }
        });

        alert.setNegativeButton("Отказаться", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.setCancelable(true);

        AlertDialog a = alert.create();
        a.show();

    }

    @Override
    public void onRewardedVideoAdLoaded() {

    }

    @Override
    public void onRewardedVideoAdOpened() {

    }

    @Override
    public void onRewardedVideoStarted() {

    }

    @Override
    public void onRewardedVideoAdClosed() {

        Intent intent = new Intent(this,BookActivity.class);

        key = true;

        intent.putExtra("IMAGE", IMAGE_ID);
        intent.putExtra("DESK", DESK);

        startActivity(intent);
    }

    @Override
    public void onRewarded(RewardItem rewardItem) {
        Toast.makeText(this,"Rewarded",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {

    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int i) {

        Toast.makeText(this,"Rewarded video failed to load",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onRewardedVideoCompleted() {
        Toast.makeText(this,"Rewarded video complite",Toast.LENGTH_SHORT).show();
    }
}
