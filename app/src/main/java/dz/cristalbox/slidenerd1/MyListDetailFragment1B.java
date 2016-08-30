package dz.cristalbox.slidenerd1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by cristalbox on 8/21/2016.
 */
public class MyListDetailFragment1B extends Fragment{
TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_list_detail_fragment1_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.my_list_detail_fragment1_b_textView);
    }

    public void changeText(String data)
    {
        textView.setText(data);
    }
}
