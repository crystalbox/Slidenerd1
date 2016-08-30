package dz.cristalbox.slidenerd1.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import dz.cristalbox.slidenerd1.entity.Person;
import dz.cristalbox.slidenerd1.R;

/**
 * Created by cristalbox on 8/21/2016.
 */
public class MyListDetailFragment1BaseAdapter extends BaseAdapter{
   ArrayList<Person> myList;
    LayoutInflater inflater;

    public MyListDetailFragment1BaseAdapter(ArrayList<Person> myList, Context context) {
        this.myList = myList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Person getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return myList.get(position).get_id();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder myViewHolder;
      if (convertView==null)
      {
          convertView=this.inflater.inflate(R.layout.single_row,parent,false);
          myViewHolder=new MyViewHolder(convertView);
          convertView.setTag(myViewHolder);
      }
        else
      {
          myViewHolder=(MyViewHolder)convertView.getTag();
      }

        Person person = getItem(position);
        myViewHolder.textView1.setText(person.getTitle());
        myViewHolder.textView2.setText(person.getDescription());


        return convertView;
    }

    public class MyViewHolder
    {
        TextView textView1,textView2;

        public MyViewHolder(View view)
        {
            textView1=(TextView)view.findViewById(R.id.single_row_textView1);
            textView2=(TextView)view.findViewById(R.id.single_row_textView2);
        }
    }
}
