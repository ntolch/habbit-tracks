package com.example.habbittracks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

/* TODO: Save state of list of habits when resuming Main Activity from adding a new habit in Habity Activity */

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> listOfHabits = new ArrayList<>();
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;

    public void addNewHabit(View view) {
        Intent addHabitIntent = new Intent(getApplicationContext(), HabitActivity.class);
        startActivity(addHabitIntent);
    }

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

        String savedHabit = getIntent().getStringExtra("habit");
        listOfHabits.add(savedHabit);
    }
}
