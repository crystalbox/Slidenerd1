package dz.cristalbox.slidenerd1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by cristalbox on 8/17/2016.
 */
public class MyFragment4A extends Fragment implements View.OnClickListener {
    Button button;
    int counter;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment4_a_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button = (Button) getActivity().findViewById(R.id.my_fragment4_a_button);
        button.setOnClickListener(this);
    }


//-----------------------------------------------------------------Communicator
    Communicator comm;
    public void setCommunicator(Communicator c) {
        comm = c;
    }
    public interface Communicator {
        public void respond(String data);
    }
//---------------------------------------------------------------use it
@Override
public void onClick(View v) {
    counter++;
comm.respond("the button was clicked "+ counter + " times" );
}
}
