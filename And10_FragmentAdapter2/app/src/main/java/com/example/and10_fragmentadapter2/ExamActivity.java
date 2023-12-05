package com.example.and10_fragmentadapter2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.and10_fragmentadapter2.exam.ExamAdapter;
import com.example.and10_fragmentadapter2.melon.MelonAdapter;

public class ExamActivity extends AppCompatActivity {
    RecyclerView recv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        recv = findViewById(R.id.recv);  // View 만 구현 Adapter
        ExamAdapter adapter = new ExamAdapter(getLayoutInflater());
        recv.setAdapter(adapter);
        recv.setLayoutManager(new LinearLayoutManager(this));
    }
}