package com.example.habbittracks;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class HabitAdapter extends RecyclerView.Adapter {
    private ArrayList<String> habits;
    public TextView habitView;

    HabitAdapter(ArrayList<String> listOfHabits) {
        habits = listOfHabits;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView habitView;
//        public TextView habitView;
//        public View layout;

        ViewHolder(View v) {
            super(v);
//            layout = v;
            habitView = v.findViewById(R.id.habitTextView);
        }
    }

    public void add(int position, String item) {
        habits.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(int position) {
        habits.remove(position);
        notifyItemRemoved(position);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        String habit = habits.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.habitView.setText(habit);

        // Set item views based on your views and data model
//        TextView textView = holder.habitView;
//        textView.setText(habit);
    }

    @Override
    public int getItemCount() {
        if (habits != null) {
            return habits.size();
        } else {
            return 0;
        }
    }
}
