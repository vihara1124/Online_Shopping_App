package com.madproject.ladysmartapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class LatestDeals extends AppCompatActivity {

    private RecyclerView recyclerView;
    int[] images={R.drawable.w0,R.drawable.w1,R.drawable.w2,R.drawable.w3,R.drawable.w4,R.drawable.w5};
    String details[]={"Women Clothing 001","Women Clothing 002","Women Clothing 003","Women Clothing 004","Women Clothing 005","Women Clothing 006"};
    int[] prices={6999,1299,4159,1899,2949,1499};
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_shirts);
        recyclerView=findViewById(R.id.rvTShirts);
        final String sna=getIntent().getStringExtra("NAME");
        final String sph=getIntent().getStringExtra("PHONE");
        final String spa=getIntent().getStringExtra("PASSWORD");
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(images,details,prices,this,sna,sph,spa,"LatestDeals");
        recyclerView.setAdapter(adapter);
    }
    public void onBackPressed(){
        final String sna=getIntent().getStringExtra("NAME");
        final String sph=getIntent().getStringExtra("PHONE");
        final String spa=getIntent().getStringExtra("PASSWORD");
        Intent intent=new Intent(LatestDeals.this,HomePageActivity.class);
        intent.putExtra("NAME",sna);
        intent.putExtra("PHONE",sph);
        intent.putExtra("PASSWORD",spa);
        intent.putExtra("CALLINGACTIVITY","Division");
        startActivity(intent);
    }
}
