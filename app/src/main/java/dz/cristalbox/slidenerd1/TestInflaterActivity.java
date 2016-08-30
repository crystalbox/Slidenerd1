package dz.cristalbox.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class TestInflaterActivity extends AppCompatActivity {
    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_inflater);

        linear = (LinearLayout) findViewById(R.id.my_lineare_layout);

        LayoutInflater l = getLayoutInflater();

        View v = l.inflate(R.layout.sublayout, linear);
    }
}
