package com.example.musicplayer;
/*
*
* Music item class
* */
public class Music {
    private String songTitle;
    private int mImageResourceId;
    private String numOfListens;
    public String getSongTitle() {
        return songTitle;
    }
    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public String getNumOfListens() {
        return numOfListens;
    }
    public Music(String songTitle, String numOfListens, int mImageResourceId) {
        this.songTitle = songTitle;
        this.mImageResourceId = mImageResourceId;
        this.numOfListens = numOfListens;

    }
}
