package com.android.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {

    private static ArrayList<Song> librarySongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        //ArrayList of Songs in library
        librarySongs = new ArrayList<Song>();
        librarySongs.add(new Song("Baby Shark","PinkFong","1:00",R.drawable.baby_shark));
        librarySongs.add(new Song("Beat it","Michael Jackson","7:39",R.drawable.beat_it));
        librarySongs.add(new Song("Why Why","Shannon Williams","5:49",R.drawable.why_why));
        librarySongs.add(new Song("The Hives","Tick Tick Boom","2:53",R.drawable.tick_tick_boom));
        librarySongs.add(new Song("Bad","Tablo","4:07",R.drawable.bad));
        librarySongs.add(new Song("42","Coldplay","3:57",R.drawable.forty_two));
        //Adapter
        LibrarySongAdapter adapter = new LibrarySongAdapter(this,librarySongs);
        ListView listView = findViewById(R.id.listview_library);
        listView.setAdapter(adapter);
    }

    public static ArrayList<Song> getLibrarySongs() {
        return librarySongs;
    }
}