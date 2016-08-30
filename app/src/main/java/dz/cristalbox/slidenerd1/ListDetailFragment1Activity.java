package dz.cristalbox.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListDetailFragment1Activity extends AppCompatActivity implements MyListDetailFragment1A.Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_detail_fragment1);


        MyListDetailFragment1A fragA = (MyListDetailFragment1A) getFragmentManager().findFragmentById(R.id.activity_list_detail_fragment1_fragment_a);
        fragA.setCommunicator(this);



    }

    @Override
    public void respond(String data) {

        MyListDetailFragment1B fragB = (MyListDetailFragment1B) getFragmentManager().findFragmentById(R.id.activity_list_detail_fragment1_fragment_b);
        fragB.changeText(data);
    }
}
