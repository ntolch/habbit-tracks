package com.example.habbittracks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> listOfHabits = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfHabits.add("Work Out");
        listOfHabits.add("Yoga");
        listOfHabits.add("Read");

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        HabitAdapter adapter = new HabitAdapter(listOfHabits) ;
        recyclerView.setAdapter(adapter);


        for (int i = 0; i < listOfHabits.size(); i++) {
            Log.i("\n**HABITS", listOfHabits.get(i));
            Log.i("list number", String.valueOf(i));
        }
    }
}
