package com.example.and10_fragmentadapter2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and10_fragmentadapter2.melon.MelonAdapter;

import org.w3c.dom.Text;

public class RecyclerActivity extends AppCompatActivity {
    RecyclerView recv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        recv = findViewById(R.id.asd);
        MelonAdapter adapter = new MelonAdapter(getLayoutInflater());
        recv.setAdapter(adapter);
        recv.setLayoutManager(new LinearLayoutManager(this));
    }
}