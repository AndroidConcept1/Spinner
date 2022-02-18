package com.abulkalam.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
// We need to use ArrayAdapter class to store the country list (therefore implements AdapterView.OnItemSelected it
// overrides two methods onItemSelected & onNothingSelected

public class MainActivity extends AppCompatActivity implements
    AdapterView.OnItemSelectedListener{
    //declaring data
    String [] country= {"India","Pakistan","Bangladesh","Nepal","Sri Lanka", "Afganistan", "Bhutan",
            "Iran","Myanmar","India","Pakistan","Bangladesh","Nepal","Sri Lanka", "Afganistan",
            "Bhutan", "Iran","Myanmar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);
        //Register a callback to be invoked when an item in this AdapterView has been selected.
        spinner.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list (for providing different view to AdapterView)
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);
    }

    @Override
    //Action on ItemSelected
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    //Action on on nothing selected
    public void onNothingSelected(AdapterView<?> parent) {

    }
}