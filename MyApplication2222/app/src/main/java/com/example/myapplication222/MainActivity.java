package com.example.myapplication222;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private  long time;

   @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       time = System.currentTimeMillis();
       Log.d("TAG", "Yfxb");

   }
   @Override
    protected  void onStart(){
       super.onStart();
       Log.i("TAG","начинается");
   }
    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("TAG","ggf");
    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.w("TAG","Приостановлена");

        long time1 = System.currentTimeMillis();
        long time2 = (time1 - time) / 1000;

        Intent intent = new Intent(this, AnotherActivity2.class);
        intent.putExtra("finishTime",time2);
        startActivity(intent);
    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d("TAG","Остановка");
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.e("TAG","уничтожений");
    }
}