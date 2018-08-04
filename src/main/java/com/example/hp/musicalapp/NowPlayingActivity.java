package com.example.hp.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlayingActivity extends AppCompatActivity {

    boolean playing = true;
    TextView artist;
    TextView title;
    TextView album;
    ImageView imgAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        artist = findViewById(R.id.artistTv);
        title = findViewById(R.id.titleTv);
        album = findViewById(R.id.albumTv);
        imgAlbum = findViewById(R.id.img_album);
        if (getIntent().hasExtra("album"))
            album.setText(getIntent().getStringExtra("album"));
        if (getIntent().hasExtra("artist"))
            artist.setText(getIntent().getStringExtra("artist"));
        if (getIntent().hasExtra("title"))
            title.setText(getIntent().getStringExtra("title"));
        if (getIntent().hasExtra("img_res"))
            imgAlbum.setImageResource(getIntent().getIntExtra("img_res", R.drawable.ic_baseline_album_24px));

    }

    public void clickPlay(View view) {
        playing = !playing;
        ((ImageView) findViewById(R.id.playBt)).setImageResource(playing ? R.drawable.ic_baseline_play_arrow_24px : R.drawable.ic_baseline_pause_24px);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_now_playing, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.albumsMenu:
                startActivity(new Intent(this, AlbumsActivity.class));
                break;
            case R.id.allTracksMenu:
                startActivity(new Intent(this, AllTracksActivity.class));
                break;
            case R.id.artistsMenu:
                startActivity(new Intent(this, ArtistsActivity.class));
                break;
            case R.id.homeMenu:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}