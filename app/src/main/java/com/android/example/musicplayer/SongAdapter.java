package com.android.example.musicplayer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_store, parent, false);
        }
        Song currentSong = getItem(position);

        ImageView songImage = listItemView.findViewById(R.id.song_image);
        if (currentSong.getImage() > -1) {
            songImage.setImageResource(currentSong.getImage());
        }

        //Set the song name
        TextView textName = listItemView.findViewById(R.id.textview_song_name);
        textName.setText(currentSong.getName());

        //Set the artist name
        TextView textArtist = listItemView.findViewById(R.id.textView_artist);
        textArtist.setText(currentSong.getArtist());

        //Set the duration
        TextView textDuration = listItemView.findViewById(R.id.textview_duration);
        textDuration.setText(currentSong.getDuration());

        //Buy textview button that sends to link to buy the music
        TextView buyButton = listItemView.findViewById(R.id.textview_buy);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(currentSong.getLink()));
                getContext().startActivity(browse);
            }
        });

        return listItemView;
    }

}
