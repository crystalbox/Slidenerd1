package dz.cristalbox.slidenerd1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Fragment2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment2);

        Fragment frag2=new MyFragment2();



        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();
        transaction.add(R.id.activity_fragment2_RelativeLayout,frag2,"crystalFrag2");


        transaction.commit();
    }
}
