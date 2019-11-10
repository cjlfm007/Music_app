package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE = 200;
    private int musicImg;
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
        final ListView listView = findViewById(R.id.music_list_view);
        listView.setAdapter(musicAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // selected item
                //String selected = ((ImageView) view.findViewById(R.id.music_item_icon));

                //Toast toast = Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT);
                //String text = listView.get(position).tostring().trim();//first method
                //final String text = ((TextView)view).getText();

                //musicImg = listView.getmusicAdapter.getItem(position).image();
                //Log.d("image","" + musicImg);
                //Music playingMusic = musicAdapter.getItem(position);
                //Toast toast = Toast.makeText(getApplicationContext(), selected, Toast.LENGTH_SHORT);
                //                toast.show();
                //TextView nameTextView = musicList.findViewById(R.id.music_name);
                //nameTextView.setText(playingMusic.getSongTitle());
                //TextView numberTextView = musicList.findViewById(R.id.listen_number);
                //numberTextView.setText(playingMusic.getNumOfListens());
                //ImageView iconView = musicList.findViewById(R.id.music_item_icon);
                //TextView textview = (TextView)row.findViewById(R.id.tvTop);
                ImageView imageview = (ImageView) view.findViewById(R.id.music_item_icon);
                //String product = textview.getText().toString();
                musicImg = imageview.getId();

            }
        });
    }

    public void openMusicItem(View view){
        Intent i  = new Intent(this, MusicItemActivity.class);

        Bundle extras = new Bundle();
        extras.putInt("Image",musicImg);
       // extras.putInt("USER_ID", 21);
        //extras.putIntArray("USER_SELCTIONS", [1, 2, 3, 4, 5]);

        //Intent intent = new Intent(this, NextActivity.class);
        i.putExtras(extras);

        //i.putExtra("Value1", musicImg);
        //i.putExtra("Value2", "This value two ActivityTwo");
        // set the request code to any code you like,
        // you can identify the callback via this code
        startActivity(i);
    }
}
