package com.example.mymenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout back;
    ArrayList<MenuItem> items;
    int n=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        back = findViewById(R.id.back);
        items = new ArrayList<>();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu,menu);
        n = menu.size();
        for(int i=0;i<n;i++)
        {
            items.add(menu.findItem(i));
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.green:
                for (int i = 0; i < n; i++) {
                    items.get(i).setEnabled(true);
                }
                back.setEnabled(false);
                back.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.red:
                back.setBackgroundColor(Color.RED);
                return true;
            case R.id.yellow:
                back.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.magenta:
                back.setBackgroundColor(Color.MAGENTA);
                return true;
            default:
                return false;
        }
       }}

