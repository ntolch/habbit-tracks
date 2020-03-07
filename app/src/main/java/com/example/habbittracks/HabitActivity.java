package com.example.habbittracks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class HabitActivity extends AppCompatActivity {
    EditText newHabitEditText;

    public void addHabitFromUserInput(View view) {
        Intent habitAddedIntent = new Intent(getApplicationContext(), MainActivity.class);
        habitAddedIntent.putExtra("habit", newHabitEditText.getText().toString());
        Log.i("User Input", newHabitEditText.getText().toString());
        startActivity(habitAddedIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habit);

        newHabitEditText = findViewById(R.id.newHabitEditText);

    }
}
