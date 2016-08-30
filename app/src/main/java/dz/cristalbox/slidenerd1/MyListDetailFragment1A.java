package dz.cristalbox.slidenerd1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import dz.cristalbox.slidenerd1.entity.Person;
import dz.cristalbox.slidenerd1.util.MyListDetailFragment1BaseAdapter;

/**
 * Created by cristalbox on 8/21/2016.
 */
public class MyListDetailFragment1A extends Fragment implements View.OnClickListener,AdapterView.OnItemClickListener {
    Button button;
    int counter;
    ListView listView;

    ArrayList<Person> mList = new ArrayList();
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


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_list_detail_fragment1_a, container, false);


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        for (int i = 0; i <= 7; i++) {
            mList.add(new Person(title[i], desc[i], img[i]));
        }

        button = (Button) getActivity().findViewById(R.id.my_list_detail_fragment1_a_button);
        listView=(ListView) getActivity().findViewById(R.id.my_list_detail_fragment1_a_listView);
        button.setOnClickListener(this);

        MyListDetailFragment1BaseAdapter adapter =new MyListDetailFragment1BaseAdapter(mList,getActivity());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View v) {
        counter++;
        comm.respond("the button was clicked " + counter + " times");
    }

    //-------------------------------------------Communicator
    Communicator comm;

    public interface Communicator {
        public void respond(String data);
    }

    public void setCommunicator(Communicator c) {
        this.comm = c;
    }
//---------------------------------------------------------------------------------
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        comm.respond(mList.get(position).getDescription());
    }
}
