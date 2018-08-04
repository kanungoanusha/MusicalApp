package com.example.hp.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AllTracksActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_tracks);
        listView = findViewById(R.id.lvTracks);
        final ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("Havana", "Camila Cabeo", "havana", R.drawable.havana));
        tracks.add(new Track("Attention", "Charlie Puth", "Attention", R.drawable.attention));
        tracks.add(new Track("Hips Don't Lie", "Shakira", "Hips Don't Lie", R.drawable.hipsdontlie));
        tracks.add(new Track("Breathless", "Shankar Mahadevan", "Breathless", R.drawable.breathless));
        tracks.add(new Track("Cheap Thrills", "Sia", "Cheap Thrills", R.drawable.cheapthrills));
        tracks.add(new Track("Lahore", "Guru Randhawa", "Lahore", R.drawable.lahore));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AllTracksActivity.this, NowPlayingActivity.class);
                intent.putExtra("album", tracks.get(i).getAlbumTitle());
                intent.putExtra("artist", tracks.get(i).getArtist());
                intent.putExtra("title", tracks.get(i).getTitle());
                intent.putExtra("img_res", tracks.get(i).getAlbum_res());
                startActivity(intent);
            }
        });
        listView.setAdapter(new TracksAdapter(this, tracks));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_all_tracks, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.albumsMenu:
                startActivity(new Intent(this, AlbumsActivity.class));
                break;
            case R.id.artistsMenu:
                startActivity(new Intent(this, ArtistsActivity.class));
                break;
            case R.id.nowPlayingMenu:
                Intent intent = new Intent(this, NowPlayingActivity.class);
                intent.putExtra("album", "Havana");
                intent.putExtra("artist", "Camila Cabeo");
                intent.putExtra("title", "Havana");
                intent.putExtra("img_res", R.drawable.havana);
                startActivity(intent);
                break;
            case R.id.homeMenu:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
