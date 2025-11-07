package com.example.myapplication222;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AnotherActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another2);

        long elapsedTime = getIntent().getLongExtra("finishTime", 0);
        String characterName = getIntent().getStringExtra("persona_name");

        TextView characterInfoTextView = findViewById(R.id.textViewTime);
        characterInfoTextView.setText("Персонаж: " + characterName);
    }
}