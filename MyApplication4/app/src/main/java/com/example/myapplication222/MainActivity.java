package com.example.myapplication222;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private long time;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        time = System.currentTimeMillis();
        Log.d("TAG", "onCreate");

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.catalogRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Persona> personaList = new ArrayList<>();

        personaList.add(new Persona("Джери", R.mipmap.i200w, R.mipmap.bit));
        personaList.add(new Persona("Мурзик", R.mipmap.cat1, R.mipmap.ic));
        personaList.add(new Persona("Рыжик", R.mipmap.cat2, R.mipmap.ic));
        personaList.add(new Persona("Васька", R.mipmap.gg2, R.mipmap.ic));

        PersonaAdapter adapter = new PersonaAdapter(personaList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "начинается");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TAG", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("TAG", "Приостановлена");

        long time1 = System.currentTimeMillis();
        long time2 = (time1 - time) / 1000;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TAG", "Остановка");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG", "уничтожений");
    }
}