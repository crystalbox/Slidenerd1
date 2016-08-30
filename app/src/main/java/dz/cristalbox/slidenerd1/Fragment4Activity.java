package dz.cristalbox.slidenerd1;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment4Activity extends AppCompatActivity implements MyFragment4A.Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment4);

        FragmentManager manager = getFragmentManager();
        MyFragment4A f4a = (MyFragment4A) manager.findFragmentById(R.id.activity_fragment4_fragment4_a);
        f4a.setCommunicator(this);
    }

    @Override
    public void respond(String data) {
        FragmentManager manager = getFragmentManager();
        MyFragment4B f4b = (MyFragment4B) manager.findFragmentById(R.id.activity_fragment4_fragment4_b);
        f4b.changetext(data);
    }
}
