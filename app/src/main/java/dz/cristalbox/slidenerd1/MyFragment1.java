package dz.cristalbox.slidenerd1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cristalbox on 8/16/2016.
 */
public class MyFragment1 extends Fragment {
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.w("CRYSTAL","onAttach");
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.w("CRYSTAL","onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w("CRYSTAL","onCreate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.w("CRYSTAL","onCreateView");
        return inflater.inflate(R.layout.my_fragment1_layout,container,false);

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.w("CRYSTAL","onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w("CRYSTAL","onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.w("CRYSTAL","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.w("CRYSTAL","onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.w("CRYSTAL","onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.w("CRYSTAL","onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.w("CRYSTAL","onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.w("CRYSTAL","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.w("CRYSTAL","onDetach");
    }
}
