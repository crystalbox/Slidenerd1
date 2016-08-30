package dz.cristalbox.slidenerd1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by cristalbox on 8/17/2016.
 */
public class MyFragmentA extends Fragment implements View.OnClickListener {
    Button button;
    int counter;
    Communicator comm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        button = (Button) getActivity().findViewById(R.id.fragment_a_layout_button);
        button.setOnClickListener(this);
        comm = (Communicator) getActivity();
    }


    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("the button was clicked " + counter + " times");

    }
}
