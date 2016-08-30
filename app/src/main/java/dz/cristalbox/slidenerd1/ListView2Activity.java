package dz.cristalbox.slidenerd1;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ListView2Activity extends AppCompatActivity {
    ListView listView;
    String[] memeTitles;
    String[] memeDescriptions;
    int[] images = {R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme5, R.drawable.meme6,
            R.drawable.meme7, R.drawable.meme8, R.drawable.meme9, R.drawable.meme10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);

        Resources res = getResources();
        memeTitles = res.getStringArray(R.array.titles);
        memeDescriptions = res.getStringArray(R.array.descriptions);
        listView = (ListView) findViewById(R.id.activity_list_view2_listView);

        CrystalAdapter adapter = new CrystalAdapter(this, memeTitles, images, memeDescriptions);
        listView.setAdapter(adapter);

    }
}

class CrystalAdapter extends ArrayAdapter<String> {
    Context context;
    int[] imagesArray;
    String[] titlesArray;
    String[] descriptionsArray;


    CrystalAdapter(Context c, String[] titles, int[] images, String[] descriptions) {
        super(c, R.layout.single_row, R.id.single_row_textView1, titles);
        this.context = c;
        this.imagesArray = images;
        this.titlesArray = titles;
        this.descriptionsArray = descriptions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.single_row, parent, false);
        }


        ImageView myImage = (ImageView) row.findViewById(R.id.single_row_imageView);
        TextView myTitle = (TextView) row.findViewById(R.id.single_row_textView1);
        TextView myDescription = (TextView) row.findViewById(R.id.single_row_textView2);

        myImage.setImageResource(imagesArray[position]);
        myTitle.setText(titlesArray[position]);
        myDescription.setText(descriptionsArray[position]);
        return row;
    }
}