package dz.cristalbox.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class CustomToastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toast);
    }

    public void showCustomToast(View view) {
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);

        LayoutInflater inflater = getLayoutInflater();
        View apperance = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.root));
        toast.setView(apperance);
        toast.show();
    }
}
