package com.example.vsvll.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    TextView textView;
    String[] country = {"India","China","Iraq","Bhutan","Bangladesh","Australia","America","Japan","Africa"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.acTextView);
        textView =  findViewById(R.id.textView);

        textView.setText("Country Name:\n India,China,Iraq,Bhutan,Bangladesh,Australia,America,Japan,Africa");

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,country);
        autoCompleteTextView.setAdapter(adapter);

    }
}
