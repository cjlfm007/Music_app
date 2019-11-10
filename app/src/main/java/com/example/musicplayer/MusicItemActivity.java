package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ImageView;

public class MusicItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_item);
        //get the current intent
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        Integer img = extras.getInt("Image",0);
        ImageView imageView = findViewById(R.id.music_item_icon_pa);
        imageView.setImageResource(img);
    }
}
