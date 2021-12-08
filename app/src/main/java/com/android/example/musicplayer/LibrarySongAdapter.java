package com.android.example.musicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LibrarySongAdapter extends ArrayAdapter<Song> {
    public LibrarySongAdapter(Activity context, ArrayList<Song> songs){
        super(context,0,songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);

        ImageView songImage = listItemView.findViewById(R.id.song_image);
        if(currentSong.getImage()>-1){
            songImage.setImageResource(currentSong.getImage());
        }

        TextView textName = listItemView.findViewById(R.id.textview_song_name);
        textName.setText(currentSong.getName());

        TextView textArtist = listItemView.findViewById(R.id.textView_artist);
        textArtist.setText(currentSong.getArtist());

        TextView textDuration = listItemView.findViewById(R.id.textview_duration);
        textDuration.setText(currentSong.getDuration());

        return listItemView;
    }
}
