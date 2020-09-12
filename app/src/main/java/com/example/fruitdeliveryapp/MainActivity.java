package com.example.fruitdeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyAdapter myAdapter;
    RecyclerView recyclerView;
    int[] images = {R.drawable.apple,

            R.drawable.bananas,
            R.drawable.blueberry,
            R.drawable.cantaloupe,
            R.drawable.fruit,
            R.drawable.guava,
            R.drawable.lemon,
            R.drawable.mango,
            R.drawable.pineapple,
            R.drawable.tomato,

    };


    String[] name, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recylearID);

        name = getResources().getStringArray(R.array.fruitName);
        price = getResources().getStringArray(R.array.price);


        myAdapter = new MyAdapter(this, name, price, images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        myAdapter.setOnItemClickListener(new MyAdapter.ClickListener() {
            @Override
            public void onItemClick(int position, View view) {


                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, AppleActivity.class);
                    startActivity(intent);
                }
                if (position == 1) {
                    Intent intent = new Intent(MainActivity.this, BananaActivity.class);
                    startActivity(intent);
                }

                if (position == 5) {
                    Intent intent = new Intent(MainActivity.this, GuavaActivity.class);
                    startActivity(intent);
                }


                if (position == 6) {
                    Intent intent = new Intent(MainActivity.this, LemonActivity.class);
                    startActivity(intent);
                }


            }

            @Override
            public void onItemLongClick(int position, View view) {

            }
        });

    }

}