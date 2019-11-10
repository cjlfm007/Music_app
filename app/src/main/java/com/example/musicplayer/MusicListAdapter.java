package com.example.musicplayer;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MusicListAdapter extends ArrayAdapter<Music> {
    private static final String LOG_TAG = MusicListAdapter.class.getSimpleName();
    public MusicListAdapter(Activity context, ArrayList<Music> musicArrayList) {
        super(context, 0, musicArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View musicList = convertView;
        if(musicList == null) {
            musicList = LayoutInflater.from(getContext()).inflate(
                    R.layout.music_list, parent, false);
        }
        Music playingMusic = getItem(position);
        TextView nameTextView = musicList.findViewById(R.id.music_name);
        nameTextView.setText(playingMusic.getSongTitle());
        TextView numberTextView = musicList.findViewById(R.id.listen_number);
        numberTextView.setText(playingMusic.getNumOfListens());
        ImageView iconView = musicList.findViewById(R.id.music_item_icon);
        iconView.setImageResource(playingMusic.getmImageResourceId());
        return musicList;
    }
}
