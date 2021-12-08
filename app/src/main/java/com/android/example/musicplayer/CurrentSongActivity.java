package com.android.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CurrentSongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);
        //Place Holder Song
        Song currentSong = new Song("Why Why", "Shannon Williams", "5:49", R.drawable.why_why);

        //Set views displayed to the appropriate attributes
        TextView currentSongName = findViewById(R.id.textview_current_song_name);
        currentSongName.setText(currentSong.getName());

        TextView currentSongArtist = findViewById(R.id.textview_current_artist);
        currentSongArtist.setText(currentSong.getArtist());

        ImageView currentSongImage = findViewById(R.id.image_current_song);
        currentSongImage.setImageResource(currentSong.getImage());
    }

}