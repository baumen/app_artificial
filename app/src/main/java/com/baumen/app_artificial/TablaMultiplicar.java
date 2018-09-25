package com.baumen.app_artificial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class TablaMultiplicar extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    String [][] table;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla_multiplicar);
        init();
        initRecycler();

    }

    private void init(){
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
    }
    private void initRecycler(){
        adapter = new TablaAdapter(createTable());
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }
    private String[][] createTable(){
        table = new String[10][3];
        int number = (int) (Math.random() * 10) + 1;
        for(int i=0;i<table.length; i++){
            table[i][0]=number+"";
            table[i][1]=" x ";
            table[i][2]=i+1+"";
        }
        return table;
    }
}
