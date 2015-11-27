package mr_fool.visualnovel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer mediaPlayer;
    public int length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer= MediaPlayer.create(this, R.raw.etude);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
        length=mediaPlayer.getCurrentPosition();
    }
    /*@Override
    protected void onDestroy(){
        super.onDestroy();
        mediaPlayer.release();
    }*/

    protected void onResume(){
        super.onResume();
        mediaPlayer.seekTo(length);
        mediaPlayer.start();
    }
}
