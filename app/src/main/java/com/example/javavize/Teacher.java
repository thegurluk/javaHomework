package com.example.javavize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertor_view);


        Button buttonBack = findViewById(R.id.buttonback);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Teacher.this , MainActivity.class);
                startActivity(intent);
            }
        });

        EditText decimalTextField = findViewById(R.id.textFieldDecimal);
        Spinner decimalSpinner = findViewById(R.id.spinnerDecimal);

        String[] decimalList = {"Secim yapınız" , "A" , "B" , "C", "D"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item , decimalList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        decimalSpinner.setAdapter(adapter);

        decimalSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String result = "" ;
                try {
                    String value = decimalTextField.getText().toString();
                    int decimalValue = Integer.parseInt(value);
                    String selectedValue = (String) parent.getItemAtPosition(position);
                    switch (selectedValue){
                        case "Secim yapınız" :
                            result = "0" ;
                            break;
                        case "A" :
                            result = "00" ;
                            break;
                        case "B" :
                            result = "000" ;
                            break;
                        case "C" :
                            result = "0000" ;
                            break;
                    }
                }catch (NumberFormatException error){
                    result = "";
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //byte view






        //celcius view



































    }
}