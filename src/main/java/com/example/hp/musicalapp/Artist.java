package com.example.hp.musicalapp;

public class Artist {
    private String artistName;
    private String albumName;
    private int img_res;

    public Artist(String artistName, String albumName, int img_res) {
        this.artistName = artistName;
        this.albumName = albumName;
        this.img_res = img_res;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getImg_res() {
        return img_res;
    }

}
