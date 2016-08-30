package dz.cristalbox.slidenerd1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import dz.cristalbox.slidenerd1.entity.Person;
import dz.cristalbox.slidenerd1.util.MyBaseAdapter;

public class BaseAdapterActivity extends AppCompatActivity {
    ListView listView;
    ArrayList mList = new ArrayList();
    String[] title = new String[]{
            "Title 1", "Title 2", "Title 3", "Title 4",
            "Title 5", "Title 6", "Title 7", "Title 8"
    };
    String[] desc = new String[]{
            "Desc 1", "Desc 2", "Desc 3", "Desc 4",
            "Desc 5", "Desc 6", "Desc 7", "Desc 8"
    };
    int[] img = new int[]{
            R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4,
            R.drawable.meme5, R.drawable.meme6, R.drawable.meme7, R.drawable.meme8
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);

        listView = (ListView) findViewById(R.id.activity_base_adapter_listView);

        for (int i = 0; i <= 7; i++) {
            mList.add(new Person(title[i], desc[i], img[i]));
        }

        listView.setAdapter(new MyBaseAdapter(mList, this));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv= (TextView)view.findViewById(R.id.single_row_textView1);
                Toast.makeText(BaseAdapterActivity.this,tv.getText(),Toast.LENGTH_LONG).show();
            }
        });
    }
}
