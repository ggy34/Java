package com.example.myapplication222;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        // Получение Parcelable объекта
        User user = getIntent().getParcelableExtra("user");

        TextView textView = findViewById(R.id.textViewActivity4);

        if (user != null) {
            String details = "Имя: " + user.getName() + "\n" +
                    "Компания: " + user.getCompany() + "\n" +
                    "Возраст: " + user.getAge() + "\n" +
                    "Parcelable работает!";
            textView.setText(details);
        } else {
            textView.setText("Объект не передан");
        }
    }
}