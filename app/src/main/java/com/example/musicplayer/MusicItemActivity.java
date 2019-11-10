package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MusicItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_item);
        Intent intent = getIntent();
        Integer img = intent.getIntExtra("Image",0);
        String title = intent.getStringExtra("Title");
        String number = intent.getStringExtra("Number");
        ImageView imageView = findViewById(R.id.music_item_icon_pa);
        imageView.setImageResource(img);
        TextView textView1 = findViewById(R.id.music_name);
        textView1.setText(title);
        TextView textView2 = findViewById(R.id.listen_number);
        textView2.setText(number);
    }
}
