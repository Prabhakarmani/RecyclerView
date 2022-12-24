package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity
{

    String[] language={"java","javascript","c#","php","c","c++","Python"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        RecyclerView programminglist=(RecyclerView) findViewById(R.id.programminglist);
        programminglist.setLayoutManager(new LinearLayoutManager(this));
        programminglist.setAdapter(new ProgrammingAdapter(language));

        //Viewholder and adapter


    }
}