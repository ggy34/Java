package com.example.myapplication222;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private long startTime;
    private RecyclerView charactersRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTime = System.currentTimeMillis();
        Log.d("APP_LOG", "onCreate");

        setupCharactersRecyclerView();
    }

    private void setupCharactersRecyclerView() {
        charactersRecyclerView = findViewById(R.id.catalogRecyclerView);
        charactersRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Character> characterList = new ArrayList<>();
        characterList.add(new Character("Джери", R.mipmap.i200w, R.mipmap.bit));
        characterList.add(new Character("Мурзик", R.mipmap.cat1, R.mipmap.ic));
        characterList.add(new Character("Рыжик", R.mipmap.cat2, R.mipmap.ic));
        characterList.add(new Character("Васька", R.mipmap.gg2, R.mipmap.ic));

        CharacterAdapter adapter = new CharacterAdapter(characterList);
        charactersRecyclerView.setAdapter(adapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APP_LOG", "Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("APP_LOG", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("APP_LOG", "Activity paused");

        long currentTime = System.currentTimeMillis();
        long elapsedSeconds = (currentTime - startTime) / 1000;

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("APP_LOG", "Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("APP_LOG", "Activity destroyed");
    }
}