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

public class ArtistsAdapter extends ArrayAdapter {

    ArrayList<Artist> artists;

    public ArtistsAdapter(@NonNull Context context, ArrayList<Artist> artists) {
        super(context, 0);
        this.artists = artists;
    }

    @Override
    public int getCount() {
        return artists.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null)
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.artist_list_item, null);
        TextView artist = v.findViewById(R.id.tvArtist);
        TextView album = v.findViewById(R.id.tvAlbum);
        ImageView img = v.findViewById(R.id.ivAlbum);
        artist.setText(artists.get(position).getArtistName());
        album.setText(artists.get(position).getAlbumName());
        img.setImageResource(artists.get(position).getImg_res());
        return v;
    }
}