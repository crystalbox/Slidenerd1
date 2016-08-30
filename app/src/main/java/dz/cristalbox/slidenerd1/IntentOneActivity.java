package dz.cristalbox.slidenerd1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IntentOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one);
    }

    public void process(View view) {
        Intent intent = null,chooser=null;
        if (view.getId() == R.id.intent_one_button_launch_map) {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("geo:19.076,72.8777"));
            chooser=Intent.createChooser(intent,"launch map");
            startActivity(chooser);
        }
        if (view.getId() == R.id.intent_one_button_launch_market)
        {
            intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("market://details?id=com.google.android.apps.maps"));
            chooser=Intent.createChooser(intent,"launch market");
            startActivity(chooser);
        }
        if (view.getId() == R.id.intent_one_button_send_email)
        {
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to={"ssaamyy@gmail.com","cristalbox.dz@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL,to);
            intent.putExtra(Intent.EXTRA_SUBJECT,"hi, this was sent from my app");
            intent.putExtra(Intent.EXTRA_TEXT,"hey, what up, how you doing?, this is my first email message");
            intent.setType("message/rfc822");
            chooser=Intent.createChooser(intent,"send email");
           // startActivity(chooser);
            startActivityForResult(chooser, 0);
        }

    }
}
