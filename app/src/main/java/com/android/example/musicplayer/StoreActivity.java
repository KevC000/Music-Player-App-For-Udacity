package com.android.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class StoreActivity extends AppCompatActivity {

    public static ArrayList<Song> storeSongs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        //ArrayList of available songs
        storeSongs = new ArrayList<Song>();
        storeSongs.add(new Song("Not Today", "BTS", "4:51", R.drawable.not_today,"https://www.amazon.com/dp/B0756QQCRJ/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("SAIL", "AWolnation", "4:09",R.drawable.sail,"https://www.amazon.com/dp/B08XC5TZ2R/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Burn It Down", "Linkin Park", "3:54",R.drawable.burn_it_down,"https://www.amazon.com/dp/B008B3H6M8/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Say So", "Doja Cat", "3:56",R.drawable.say_so,"https://www.amazon.com/dp/B0812CNFTR/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Shine", "Pentagon", "3:29",R.drawable.shine,"https://www.amazon.com/dp/B07GQ8Z4SJ/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Giants", "True Damage", "3:19",R.drawable.giants,"https://www.amazon.com/dp/B07ZKXL8B7/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Walking on a Dream", "Empire of the sun", "3:20",R.drawable.walking_on_a_dream,"https://www.amazon.com/dp/B002V3BLQQ/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Hold On", "Justin Bieber", "5:09",R.drawable.hold_on,"https://www.amazon.com/dp/B08XY9MZ17/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Around the World", "Daft Pank", "7:10",R.drawable.around_the_world,"https://www.amazon.com/dp/B000SNWG5Q/ref=dm_ws_tlw_trk1"));
        storeSongs.add(new Song("Dancing in my room", "347aidan", "3:02",R.drawable.dancing_in_my_room,"https://www.amazon.com/dp/B08N5MFXZM/ref=dm_ws_tlw_trk1"));

        //Adapter to put the items into the list view
        SongAdapter adapter = new SongAdapter(this, storeSongs);
        ListView listView = findViewById(R.id.listview_store);
        listView.setAdapter(adapter);

    }

    //getter for the array list
    public static ArrayList<Song> getStoreSongs(){
        return storeSongs;
    }

}
