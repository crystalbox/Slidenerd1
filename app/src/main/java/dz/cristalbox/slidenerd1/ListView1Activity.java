package dz.cristalbox.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListView1Activity extends AppCompatActivity /*implements AdapterView.OnItemClickListener*/ {
    ListView lv;
    String[] days = {"saturday", "sunday", "monday", "tuesday", "wednesday", "thursday", "friday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view1);
        lv = (ListView) findViewById(R.id.activity_list_view1_listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, days);
        lv.setAdapter(adapter);

        //lv.setOnItemClickListener(this);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView temp = (TextView) view;
               Toast.makeText(ListView1Activity.this, temp.getText() + " " + position, Toast.LENGTH_LONG).show();
            }
        });
    }

//    @Override
//    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        TextView temp = (TextView) view;
//        Toast.makeText(this, temp.getText() + " " + position, Toast.LENGTH_LONG).show();
//    }
}
