package e.windows10.hadiahsound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MainActivity.playSound(this,2);
    }

    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.stopSound(null);
    }
}
