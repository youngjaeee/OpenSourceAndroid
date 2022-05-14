package com.example.editinfofirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("정보 수정");
        getSupportActionBar().setTitle("정보 수정");


        Spinner disabledSpinner = (Spinner) findViewById(R.id.disabledSpinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.disabledSpinner, R.layout.spinner_layout);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        disabledSpinner.setAdapter(adapter);




        Spinner disabledClassSpinner = (Spinner) findViewById(R.id.disabledClass);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter_two = ArrayAdapter.createFromResource(this,
                R.array.disabledClass, R.layout.spinner_layout);
// Specify the layout to use when the list of choices appears
        adapter_two.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        disabledClassSpinner.setAdapter(adapter_two);
    }



}