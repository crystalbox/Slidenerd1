package dz.cristalbox.slidenerd1;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button3;
    Button buttonInstanceState;
    Button buttonIntentOne;

    //--------------------------------------------------------------lifeCycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("CRISTAL", "onCreate was called");

        button3 = (Button) findViewById(R.id.button3);
        buttonInstanceState = (Button) findViewById(R.id.button_instance_state);
        buttonIntentOne = (Button) findViewById(R.id.button_intent_one);


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("CRISTAL", "Button3 was Clicked");
            }
        });

        buttonInstanceState.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, InstanceStateActivity.class);
                startActivity(intent);
            }
        });

        buttonIntentOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IntentOneActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("CRISTAL", "onStart was called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("CRISTAL", "onResume was called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("CRISTAL", "onPause was called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("CRISTAL", "onStop was called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("CRISTAL", "onDestroy was called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("CRISTAL", "onRestart was called");
    }

    //--------------------------------------------------------------OrientationChanges

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.e("CRISTAL", "welcome to portrait mode ");

        } else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Log.e("CRISTAL", "welcome to landscape mode");
        }

    }

    //--------------------------------------------------------------buttonClick

    public void doSomething(View v) {
        if (v.getId() == R.id.button1) {
            Log.e("CRISTAL", "First Button was Clicked");
        } else if (v.getId() == R.id.button2) {
            Log.e("CRISTAL", "Second Button was Clicked");
        }

    }

    //-------------------------------------------------------------------show Toast
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "I am Toast", Toast.LENGTH_LONG);
        toast.show();
    }

    //---------------------------------------------------------------customToast
    public void customToast(View view) {
        Intent intent = new Intent(this, CustomToastActivity.class);
        startActivity(intent);
    }

    //-------------------------------------------------------------toggleButton

    public void toggleButton(View view) {
        Intent intent = new Intent(this, ToggleButtonActivity.class);
        startActivity(intent);
    }

    //----------------------------------------------------------listView1
    public void listView1(View view) {
        Intent intent = new Intent(this, ListView1Activity.class);
        startActivity(intent);
    }
    //---------------------------------------------------------listActivity

    public void listActivity(View view) {
        Intent intent = new Intent(this, ListActivityActivity.class);
        startActivity(intent);
    }

    //-------------------------------------------------------testInflater
    public void testInflater(View view)
    {
        Intent intent=new Intent(this,TestInflaterActivity.class);
        startActivity(intent);
    }
    //----------------------------------------------------------listView2
    public void listView2(View view) {
        Intent intent = new Intent(this, ListView2Activity.class);
        startActivity(intent);
    }
    //----------------------------------------------------------listViewBaseAdapter
    public void listViewBaseAdapter(View view)
    {
        Intent intent=new Intent(this,BaseAdapterActivity.class);
        startActivity(intent);
    }
    //-------------------------------------------------------------onFragments1
    public void onFragments1(View view)
    {
        Intent intent=new Intent(this,Fragment1Activity.class);
        startActivity(intent);
    }
    //--------------------------------------------------------------onFragments2

    public void onFragments2(View view)
    {
        Intent intent=new Intent(this,Fragment2Activity.class);
        startActivity(intent);
    }
    //---------------------------------------------------------------onFragments3
    public void onFragments3(View view)
    {
        Intent intent =new Intent(this,Fragment3Activity.class);
        startActivity(intent);
    }
    //---------------------------------------------------------------onFragments4
    public void onFragments4(View view)
    {
        Intent intent =new Intent(this,Fragment4Activity.class);
        startActivity(intent);
    }

    //---------------------------------------------------------------onListDetailFragment1
    public void onListDetailFragment1(View view)
    {
        Intent intent =new Intent(this,ListDetailFragment1Activity.class);
        startActivity(intent);
    }

    //---------------------------------------------------------------onDatabaseTest1
    public void onDatabaseTest1(View view)
    {
        Intent intent =new Intent(this,DatabaseTest1Activity.class);
        startActivity(intent);
    }


}
