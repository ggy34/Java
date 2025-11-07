package com.example.myapplication222;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        TextView textView = findViewById(R.id.textViewActivity3);
        textView.setText(getString(R.string.roflan_lico));

        Button button = findViewById(R.id.buttonActivity3);
        button.setOnClickListener(v -> {
            User user = new User(
                    "Иван Иванов",
                    "IT Компания",
                    25
            );


            Intent intent = new Intent(this, Activity4.class);
            intent.putExtra("user", user);
            startActivity(intent);
        });
    }
}