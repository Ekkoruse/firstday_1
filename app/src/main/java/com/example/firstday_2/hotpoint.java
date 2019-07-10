package com.example.firstday_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class hotpoint extends AppCompatActivity {
    private RecyclerView rc1;
    private ReAdapter rcad1;



    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     /*   setContentView(R.layout.activity_main);
        rc1 = findViewById(R.id.recyclerView);
        rc1.setLayoutManager(new LinearLayoutManager(this));
        rcad1 = new ReAdapter(this);
        rc1.setAdapter(rcad1);
        List<Data> list = new ArrayList<>();
        for(int i = 0; i < 100; ++ i) {
           // Data data = new Data(i + "","","");
            //list.add(data);
        }
        rcad1.setData(list);
        rcad1.notifyDataSetChanged();*/
    }
}
