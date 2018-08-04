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

public class TracksAdapter extends ArrayAdapter {

    ArrayList<Track> tracks;

    public TracksAdapter(@NonNull Context context, ArrayList<Track> tracks) {
        super(context, 0);
        this.tracks = tracks;
    }

    @Override
    public int getCount() {
        return tracks.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if (v == null)
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tracks_list_item, null);
        TextView title = v.findViewById(R.id.tvTitle);
        TextView artist = v.findViewById(R.id.tvArtist);
        ImageView img = v.findViewById(R.id.ivAlbum);
        title.setText(tracks.get(position).getTitle());
        artist.setText(tracks.get(position).getArtist());
        img.setImageResource(tracks.get(position).getAlbum_res());

        return v;
    }
}