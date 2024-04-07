package com.example.javavize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Student extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_view);

        Button backButton = findViewById(R.id.buttonBackRandom);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Student.this , MainActivity.class);
                startActivity(intent);
            }
        });
        Button createButton = findViewById(R.id.buttonCreate);



        ScrollView scrollView = new ScrollView(this);
        LinearLayout scrollLinearLayout = new LinearLayout(this);
        scrollLinearLayout.setOrientation(LinearLayout.VERTICAL);
        scrollView.addView(scrollLinearLayout);























    }
}