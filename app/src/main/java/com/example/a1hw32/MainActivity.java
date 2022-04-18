package com.example.a1hw32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> numbers;
private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycle);
        numbers = new ArrayList<>();
        numbers.add("+9963244738978");
        numbers.add("+7777777777777");
        numbers.add("+9967564547233");
        numbers.add("+8888888888888");
        numbers.add("+9963468573280");
        numbers.add("+9952583585389");
        numbers.add("+2544367656788");
        numbers.add("+3258793456679");
        numbers.add("+9953246723469");
        numbers.add("+9325677468323");
        numbers.add("+9769823465787");
        numbers.add("+2347569854367");
        numbers.add("+8679324052843");
        numbers.add("+1235679081325");
        numbers.add("+1352967073862");
        ContactAdapter adapter= new ContactAdapter(numbers);
        recyclerView.setAdapter(adapter);
    }
}