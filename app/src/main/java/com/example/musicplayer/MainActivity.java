package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of Music objects
        final ArrayList<Music> musicList = new ArrayList<>();
        musicList.add(new Music("Ard", "2000 Clicks", R.drawable.ard));
        musicList.add(new Music("Ark", "100 Clicks", R.drawable.ark));
        musicList.add(new Music("Babysong", "4 Clicks", R.drawable.babysong));
        musicList.add(new Music("Germansong", "27 Clicks", R.drawable.germansong));
        musicList.add(new Music("Hq", "51 Clicks", R.drawable.hq));
        musicList.add(new Music("Jmusic", "200 Clicks", R.drawable.jmusic));
        musicList.add(new Music("John Dory", "4 Clicks", R.drawable.jorhdory));
        musicList.add(new Music("Rock", "23 Clicks", R.drawable.rock));
        musicList.add(new Music("Pop", "2 Clicks", R.drawable.popsong));
        musicList.add(new Music("Piano", "0 Clicks", R.drawable.piano));
        musicList.add(new Music("RongHao", "129 Clicks", R.drawable.lironghao));

        final MusicListAdapter musicAdapter = new MusicListAdapter(this, musicList);
        ListView listView = findViewById(R.id.music_list_view);
        listView.setAdapter(musicAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Music playingMusic = musicAdapter.getItem(position);
                Intent test = new Intent(getApplicationContext(),MusicItemActivity.class);
                test.putExtra("Image", playingMusic.getmImageResourceId());
                test.putExtra("Title", playingMusic.getSongTitle());
                test.putExtra("Number", playingMusic.getNumOfListens());
                startActivity(test);
            }
        });
    }
}
