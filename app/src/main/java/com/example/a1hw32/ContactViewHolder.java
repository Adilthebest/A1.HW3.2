package com.example.a1hw32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private TextView numbers;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        numbers = itemView.findViewById(R.id.number);
    }

    public void bind(String namberValue) {
        numbers.setText(namberValue);
    }
}
