/// @android:id/list......IMPORTANT
package dz.cristalbox.slidenerd1;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivityActivity extends ListActivity {
    ListView lv;
    String[] days={"saturday","sunday","monday","tuesday","wednesday","thursday","friday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lv=getListView();
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        lv.setAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
       TextView temp= (TextView) v;
        Toast.makeText(this,temp.getText()+ " "+ position,Toast.LENGTH_LONG).show();
    }
}
