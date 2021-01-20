package com.madproject.ladysmartapp;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class Shoes extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images={R.drawable.shoe1,R.drawable.shoe2,R.drawable.shoe3,R.drawable.shoe4,R.drawable.shoe5,R.drawable.shoe6,R.drawable.shoe7,R.drawable.shoe8};
    private String[] details={"Shoe 001","Shoe 002","Shoe 003","Shoe 004","Shoe 005","Shoe 006","Shoe 007","Shoe 008"};
    private int[] prices={3400,2900,1899,2459,2299,2299,3649,2799};
    private RecyclerAdapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes);
        recyclerView=findViewById(R.id.rvBooks);
        final String sna=getIntent().getStringExtra("NAME");
        final String sph=getIntent().getStringExtra("PHONE");
        final String spa=getIntent().getStringExtra("PASSWORD");
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter(images,details,prices,this,sna,sph,spa,"Shoes");
        recyclerView.setAdapter(adapter);

    }
    public void onBackPressed(){
        final String sna=getIntent().getStringExtra("NAME");
        final String sph=getIntent().getStringExtra("PHONE");
        final String spa=getIntent().getStringExtra("PASSWORD");
        Intent intent=new Intent(Shoes.this,HomePageActivity.class);
        intent.putExtra("NAME",sna);
        intent.putExtra("PHONE",sph);
        intent.putExtra("PASSWORD",spa);
        intent.putExtra("CALLINGACTIVITY","Division");
        startActivity(intent);
    }


}
