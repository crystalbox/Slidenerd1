package dz.cristalbox.slidenerd1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
ToggleButton t;
    LinearLayout l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);

        t= (ToggleButton) findViewById(R.id.toggleButton);
        l= (LinearLayout) findViewById(R.id.activity_toggle_button_layout);

        t.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
if(isChecked)
{
    l.setBackgroundColor(Color.BLACK);
}
else
{
    l.setBackgroundColor(Color.WHITE);
}
    }
}
