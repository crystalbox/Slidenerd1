package dz.cristalbox.slidenerd1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cristalbox on 8/17/2016.
 */
public class MyFragment4B extends Fragment {
TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment4_b_layout,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.my_fragment4_b_textView);
    }

    public void changetext(String data) {
        textView.setText(data);

    }
}
