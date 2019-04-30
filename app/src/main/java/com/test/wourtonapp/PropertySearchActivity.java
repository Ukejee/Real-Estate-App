package com.test.wourtonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class PropertySearchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_search);


        Spinner spinner = (Spinner) findViewById(R.id.categorySpinner);
        List<String> list = new ArrayList<String>();
//        list.add("Category");
        list.add("All Categories");
        list.add("For Sale");
        list.add("For Rent");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

//        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter(dataAdapter);

        Spinner typeSpinner = (Spinner) findViewById(R.id.typeSpinner);
        List<String> typeList = new ArrayList<String>();
//        list.add("Category");
        typeList.add("All Types");
        typeList.add("Flat");
        typeList.add("House");
        typeList.add("Land");
        typeList.add("Commercial");
        ArrayAdapter<String> typeAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, typeList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

//        spinner.setOnItemSelectedListener(this);
        typeSpinner.setAdapter(typeAdapter);


        Spinner bedroomSpinner = (Spinner) findViewById(R.id.bedroomSpinner);
        List<String> brList = new ArrayList<String>();
//        list.add("Category");
        brList.add("Any");
        brList.add("1");
        brList.add("2");
        brList.add("3");
        brList.add("4");
        brList.add("5");
        brList.add("5+");
        ArrayAdapter<String> brAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, brList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

//        spinner.setOnItemSelectedListener(this);
        bedroomSpinner.setAdapter(brAdapter);

    }
}
