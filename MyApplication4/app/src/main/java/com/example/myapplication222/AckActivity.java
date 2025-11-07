package com.example.myapplication222;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import android.util.Log;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AckActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ack);

        User user = getIntent().getParcelableExtra("user");

        TextView textView = findViewById(R.id.textViewAck);

        if (user != null) {
            textView.setText("Имя: " + user.getName());
        }
    }
}