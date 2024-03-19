package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<contacts> l = new ArrayList<contacts>();
        l.add(new contacts("Sanket", "1234", R.drawable.funi));
        l.add(new contacts("Anshika", "4567", R.drawable.funi));
        l.add(new contacts("Avishkar", "7542", R.drawable.funi));
        l.add(new contacts("Falashree", "8862", R.drawable.funi));
        l.add(new contacts("Swapnil", "1573", R.drawable.funi));
        l.add(new contacts("Chetna", "7234", R.drawable.funi));
        l.add(new contacts("Sanskar", "8234", R.drawable.funi));
        l.add(new contacts("Harshada", "8132", R.drawable.funi));
        l.add(new contacts("Tejas", "2373", R.drawable.funi));
        l.add(new contacts("Aryan", "9712", R.drawable.funi));
        l.add(new contacts("Arnav", "6969", R.drawable.funi));
        l.add(new contacts("Rucha", "1972", R.drawable.funi));
        l.add(new contacts("Shrey", "4206", R.drawable.funi));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CustomAdapter(getApplicationContext(), l));
    }
}