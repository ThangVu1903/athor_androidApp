package com.example.tacgiavanhoc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tacgiavanhoc.hugo.TacPham;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<TacGia> items = new ArrayList<>();
    TacGiaApdapter adapter;
    ListView listView;
    ArrayList<TacPham> tacPhams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listTacGia);

        items.add(new TacGia(" Arthur Conan Doyle",5,tacPhams));
        items.add(new TacGia("Victor Hugo",5,tacPhams));
        items.add(new TacGia("Lev Tolstoy",5,tacPhams));
        items.add(new TacGia("JK. Rowling",5,tacPhams));
        items.add(new TacGia("Pushkin",5,tacPhams));

        adapter = new TacGiaApdapter(MainActivity.this,items);
        listView.setAdapter(adapter);

    }
}