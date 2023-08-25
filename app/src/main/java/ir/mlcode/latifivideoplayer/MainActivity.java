package ir.mlcode.latifivideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.FrameLayout;

import ir.mlcode.latifivideoplayerlibrary.UniversalMediaController;
import ir.mlcode.latifivideoplayerlibrary.UniversalVideoView;

public class MainActivity extends AppCompatActivity {


    UniversalVideoView universalVideoViewMovie;

    UniversalMediaController universalMediaController;

    FrameLayout video_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        universalVideoViewMovie = (UniversalVideoView) findViewById(R.id.universalVideoViewMovie);

        universalMediaController = (UniversalMediaController) findViewById(R.id.universalMediaController);

        video_layout = (FrameLayout) findViewById(R.id.video_layout);


        Handler handler = new Handler();
        handler.postDelayed(() -> {

            Uri uri= Uri.parse("http://5.160.125.98:5081/uploads/Videos/da2a151f-d627-430a-91a0-5ecbaa613ffa.mp4");
            universalVideoViewMovie.setMediaController(universalMediaController);
            universalVideoViewMovie.setVideoURI(uri);
            universalVideoViewMovie.start();

        }, 1000);




    }
}