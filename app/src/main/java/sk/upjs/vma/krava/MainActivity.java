package sk.upjs.vma.krava;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    private static final String TAG = "KRAVA AKTIVITA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //if (BuildConfig.DEBUG)
        Log.d(TAG, "on Create");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "on Resume");

        super.onResume();
        mediaPlayer = MediaPlayer.create(this, R.raw.cow);
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "on Pause");

        mediaPlayer.release();
        super.onPause();
    }

    public void cowClick(View view) {
        Log.d(TAG, "on Click");

        mediaPlayer.start();
    }
}