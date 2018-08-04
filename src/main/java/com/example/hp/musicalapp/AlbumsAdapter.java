package com.example.hp.musicalapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsAdapter extends ArrayAdapter {

    ArrayList<Album> albums;

    public AlbumsAdapter(@NonNull Context context, ArrayList<Album> albums) {
        super(context, 0);
        this.albums = albums;
    }

    @Override
    public int getCount() {
        return albums.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null)
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_grid_item, null);
        TextView album = v.findViewById(R.id.tvAlbum);
        TextView artist = v.findViewById(R.id.tvArtist);
        ImageView img = v.findViewById(R.id.img_album);
        album.setText(albums.get(position).getAlbum());
        artist.setText(albums.get(position).getArtist());
        img.setImageResource(albums.get(position).getImg_res());
        return v;
    }
}