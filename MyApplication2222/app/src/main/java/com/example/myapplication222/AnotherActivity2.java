package com.example.myapplication222;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AnotherActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_another2);

       long finishTime = getIntent().getLongExtra("finishTime",0);

        TextView textView = findViewById(R.id.textViewTime);
        textView.setText("Время"+finishTime);
    }
}