package dz.cristalbox.slidenerd1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment3Activity extends AppCompatActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment3);
    }

    @Override
    public void respond(String data) {
        FragmentManager manager= getFragmentManager();
        MyFragmentB fragmentB= (MyFragmentB) manager.findFragmentById(R.id.activity_fragment3_fragment_b);
        fragmentB.changeText(data);
    }
}
