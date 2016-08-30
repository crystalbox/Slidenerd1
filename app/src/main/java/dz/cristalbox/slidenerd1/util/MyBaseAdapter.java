package dz.cristalbox.slidenerd1.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import dz.cristalbox.slidenerd1.entity.Person;
import dz.cristalbox.slidenerd1.R;

/**
 * Created by cristalbox on 8/16/2016.
 */
public class MyBaseAdapter extends BaseAdapter {

    ArrayList<Person> mList = new ArrayList();
    LayoutInflater inflater;
    Context context;

    public MyBaseAdapter(ArrayList<Person> mList, Context context) {
        this.mList = mList;
        this.context = context;

        this.inflater=LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Person getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mList.get(position).get_id();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder mViewHolder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.single_row, parent, false);
            mViewHolder = new MyViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (MyViewHolder) convertView.getTag();
        }

        Person currentListData = getItem(position);

        mViewHolder.tvTitle.setText(currentListData.getTitle());
        mViewHolder.tvDesc.setText(currentListData.getDescription());
        mViewHolder.ivIcon.setImageResource(currentListData.getImg());

        return convertView;
    }

    private class MyViewHolder {
        TextView tvTitle, tvDesc;
        ImageView ivIcon;

        public MyViewHolder(View item) {
            tvTitle = (TextView) item.findViewById(R.id.single_row_textView1);
            tvDesc = (TextView) item.findViewById(R.id.single_row_textView2);
            ivIcon = (ImageView) item.findViewById(R.id.single_row_imageView);
        }
    }
}
