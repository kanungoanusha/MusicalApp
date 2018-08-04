package com.example.hp.musicalapp;

public class Album {
    private String album;
    private String artist;
    private int img_res;

    public Album(String album, String artist, int img_res) {
        this.album = album;
        this.artist = artist;
        this.img_res = img_res;
    }

    public String getAlbum() {
        return album;
    }

    public String getArtist() {
        return artist;
    }

    public int getImg_res() {
        return img_res;
    }

}
