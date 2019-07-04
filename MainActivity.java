package e.windows10.hadiahsound;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playSound(this,1);
    }

    @Override
    protected void onPause(){
        super.onPause();
        stopSound(null);
    }

    @Override
    protected void onResume(){
        super.onResume();
        playSound(this,1);
    }

    public static  void stopSound(@Nullable View view){
        mediaPlayer.stop();
        mediaPlayer.release();
    }

    public static void playSound(Context context, int i) {
        try {
            if (mediaPlayer.isPlaying()){
                mediaPlayer.stop();
                mediaPlayer.release();
            }
        } catch (Exception e){
            Toast.makeText(context,"Masuk eksepsion",Toast.LENGTH_SHORT).show();
        }

        if (i==1){
            Toast.makeText(context,"Sedang main lagu1",Toast.LENGTH_SHORT).show();
            mediaPlayer= MediaPlayer.create(context,R.raw.lagu);
        }else if (i==2){
            Toast.makeText(context,"Sedang main lagu2",Toast.LENGTH_SHORT).show();
            mediaPlayer=MediaPlayer.create(context,R.raw.lagu2);
        }
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }
    public void gantiForm(View view) {
        Intent intent= new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
