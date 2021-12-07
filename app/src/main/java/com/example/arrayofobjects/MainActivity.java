package com.example.arrayofobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;

    String[] statiEuropei = {
            "itaila",
            "francia",
            "germania",
            "danimarca"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign view to object of type ListView thanks to an implicit cast
        list = findViewById(R.id.list);

        //use of the object ArrayAdapter to adapt an Array into a ListView. The constructor is comprised of: context, layout resource, id resource, array
        ArrayAdapter<String> arrayAdapterStati = new ArrayAdapter<>(this, R.layout.activity_main, R.id.list, statiEuropei);


    }



}