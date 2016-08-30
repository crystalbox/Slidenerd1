package dz.cristalbox.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Fragment1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment1);
        Log.e("CRYSTAL","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("CRYSTAL","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("CRYSTAL","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("CRYSTAL","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("CRYSTAL","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CRYSTAL","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("CRYSTAL","onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e("CRYSTAL","onSaveInstanceState");
    }
}
