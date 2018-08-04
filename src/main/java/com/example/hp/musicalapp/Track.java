package com.example.hp.musicalapp;

public class Track {
    private String title;
    private String artist;
    private String albumTitle;
    private int album_res;

    public Track(String title, String artist, String albumTitle, int album_res) {
        this.title = title;
        this.artist = artist;
        this.album_res = album_res;
        this.albumTitle = albumTitle;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getAlbum_res() {
        return album_res;
    }
}
