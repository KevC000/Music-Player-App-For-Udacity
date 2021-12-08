package com.android.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class QueueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);

         //ArrayList of songs in queue
        ArrayList<Song> queue = new ArrayList<>();
        queue.add(new Song("Why Why","Shannon Williams","5:49",R.drawable.why_why));
        queue.add(new Song("The Hives","Tick Tick Boom","2:53",R.drawable.tick_tick_boom));
        queue.add(new Song("Bad","Tablo","4:07",R.drawable.bad));

        //Adapter
        LibrarySongAdapter adapter = new LibrarySongAdapter(this,queue);
        ListView listView = findViewById(R.id.list_queue);
        listView.setAdapter(adapter);
    }
}