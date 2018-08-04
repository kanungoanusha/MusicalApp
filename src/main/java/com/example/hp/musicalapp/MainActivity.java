package com.example.hp.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.nowPlayingCard).setOnClickListener(this);
        findViewById(R.id.allTracksCard).setOnClickListener(this);
        findViewById(R.id.artistCard).setOnClickListener(this);
        findViewById(R.id.albumsCard).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.nowPlayingCard:
                nowPlaying();
                break;
            case R.id.allTracksCard:
                allTracks();
                break;
            case R.id.artistCard:
                artist();
                break;
            case R.id.albumsCard:
                album();
                break;
            default:
                break;
        }
    }

    public void album() {
        startActivity(new Intent(this, AlbumsActivity.class));
    }

    public void artist() {
        startActivity(new Intent(this, ArtistsActivity.class));
    }

    public void allTracks() {
        startActivity(new Intent(this, AllTracksActivity.class));
    }

    public void nowPlaying() {
        Intent intent = new Intent(MainActivity.this, NowPlayingActivity.class);
        intent.putExtra("album", "Attention");
        intent.putExtra("artist", "Charlie Puth");
        intent.putExtra("title", "Attention");
        intent.putExtra("img_res", R.drawable.attention);
        startActivity(intent);
    }
}