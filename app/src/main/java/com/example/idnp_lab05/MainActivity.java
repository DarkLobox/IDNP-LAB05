package com.example.idnp_lab05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> horizontal = new ArrayList<String>();
        horizontal.add("Peru");
        horizontal.add("Argentina");
        horizontal.add("Brasil");
        horizontal.add("España");
        horizontal.add("Chile");
        horizontal.add("Uruguay");
        horizontal.add("China");
        horizontal.add("EEUU");
        horizontal.add("Japon");

        List<Integer> vertical = new ArrayList<Integer>();
        vertical.add(60);
        vertical.add(20);
        vertical.add(65);
        vertical.add(40);
        vertical.add(55);
        vertical.add(30);
        vertical.add(5);
        vertical.add(40);
        vertical.add(90);

        ViewBarChart grafico = findViewById(R.id.grafico);
        grafico.setDatos(horizontal,vertical);
    }
}