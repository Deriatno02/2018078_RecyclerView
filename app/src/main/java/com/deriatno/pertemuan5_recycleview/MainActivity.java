package com.deriatno.pertemuan5_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    String s1[], s2[], s3[];
    int images[] =
            {R.drawable.ace, R.drawable.acee, R.drawable.sasuke, R.drawable.madara};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.makanan);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        MakananAdapter appAdapter = new MakananAdapter(this, s1, s2, s3, images);
        recylerView.setAdapter(appAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager((this), RecyclerView.HORIZONTAL, false);
        recylerView.setLayoutManager(layoutManager);

    }
}