package com.android.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.example.musicplayer.databinding.ActivityCurrentSongBinding;

public class CurrentSongActivity extends AppCompatActivity {

    ActivityCurrentSongBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_song);
        binding = binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        //Place Holder Song
        Song currentSong = new Song("Why Why", "Shannon Williams", "5:49", R.drawable.why_why);

        //Set views displayed to the appropriate attributes
        binding.textviewCurrentSongName.setText(currentSong.getName());
        binding.textviewCurrentArtist.setText(currentSong.getArtist());
        binding.imageCurrentSong.setImageResource(currentSong.getImage());
    }

}