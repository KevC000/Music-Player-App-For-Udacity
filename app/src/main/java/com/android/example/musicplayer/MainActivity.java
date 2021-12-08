package com.android.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.android.example.musicplayer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //Text binding onclick listeners that starts an intent the starts their respective activity

        binding.queueActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent QueueIntent = new Intent(MainActivity.this,QueueActivity.class);
                startActivity(QueueIntent);
            }
        });

        binding.textviewCurrentSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent currentSongIntent = new Intent(MainActivity.this,CurrentSongActivity.class);
                startActivity(currentSongIntent);
            }
        });

        binding.textviewLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent libraryIntent = new Intent(MainActivity.this,LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        binding.textviewShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent storeIntent = new Intent(MainActivity.this,StoreActivity.class);
                startActivity(storeIntent);
            }
        });

    }
}