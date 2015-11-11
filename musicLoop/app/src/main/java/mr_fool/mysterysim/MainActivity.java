package mr_fool.mysterysim;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    BackgroundSound mBackgroundSound = new BackgroundSound();

    public void onResume() {
        super.onResume();
        mBackgroundSound.execute(null);
    }
    public void onPause() {
        super.onPause();
        mBackgroundSound.cancel(true);
    }

    public class BackgroundSound extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... params) {
            MediaPlayer player = MediaPlayer.create(MainActivity.this, R.raw.etude);
            player.setLooping(true); // Set looping
            player.setVolume(100, 100);
            player.start();
            return null;
        }
    }
}
