package com.example.hp.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        gridView = findViewById(R.id.gvAlbum);
        final ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(new Album("Havana", "Camila Cabeo", R.drawable.havana));
        albums.add(new Album("Attention", "Charlie Puth", R.drawable.attention));
        albums.add(new Album("Hips Don't Lie", "Shakira", R.drawable.hipsdontlie));
        albums.add(new Album("Breathless", "Shankar Mahadevan", R.drawable.breathless));
        albums.add(new Album("Cheap Thrills", "Sia", R.drawable.cheapthrills));
        albums.add(new Album("Lahore", "Guru Randhawa", R.drawable.lahore));
        albums.add(new Album("Havana", "Camila Cabeo", R.drawable.havana));
        albums.add(new Album("Attention", "Charlie Puth", R.drawable.attention));
        albums.add(new Album("Hips Don't Lie", "Shakira", R.drawable.hipsdontlie));
        albums.add(new Album("Breathless", "Shankar Mahadevan", R.drawable.breathless));
        albums.add(new Album("Cheap Thrills", "Sia", R.drawable.cheapthrills));
        albums.add(new Album("Lahore", "Guru Randhawa", R.drawable.lahore)); albums.add(new Album("Havana", "Camila Cabeo", R.drawable.havana));
        albums.add(new Album("Attention", "Charlie Puth", R.drawable.attention));
        albums.add(new Album("Hips Don't Lie", "Shakira", R.drawable.hipsdontlie));
        albums.add(new Album("Breathless", "Shankar Mahadevan", R.drawable.breathless));
        albums.add(new Album("Cheap Thrills", "Sia", R.drawable.cheapthrills));
        albums.add(new Album("Lahore", "Guru Randhawa", R.drawable.lahore));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(AlbumsActivity.this, NowPlayingActivity.class);
                intent.putExtra("album", albums.get(i).getAlbum());
                intent.putExtra("artist", albums.get(i).getArtist());
                intent.putExtra("title", "track 1");
                intent.putExtra("img_res", albums.get(i).getImg_res());
                startActivity(intent);
            }
        });
        gridView.setAdapter(new AlbumsAdapter(this, albums));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_albums, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.allTracksMenu:
                startActivity(new Intent(this, AllTracksActivity.class));
                break;
            case R.id.artistsMenu:
                startActivity(new Intent(this, ArtistsActivity.class));
                break;
            case R.id.nowPlayingMenu:
                Intent intent = new Intent(this, NowPlayingActivity.class);
                intent.putExtra("album", "Attention");
                intent.putExtra("artist", "Charlie Puth");
                intent.putExtra("title", "Attention");
                intent.putExtra("img_res", R.drawable.attention);
                startActivity(intent);
                break;
            case R.id.homeMenu:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
