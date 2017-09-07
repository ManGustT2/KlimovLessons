package com.example.vadim.klimovlessons.adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.vadim.klimovlessons.R;
import com.example.vadim.klimovlessons.model.Lesson;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    Context ctx;
    LayoutInflater layoutInflater;
    ArrayList<Lesson> object;

    public MyAdapter(Context context, ArrayList<Lesson> lessons){
        ctx = context;
        object = lessons;
        layoutInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return object.size();
    }

    @Override
    public Object getItem(int position) {
        return object.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null){
            view = layoutInflater.inflate(R.layout.item, parent, false);
        }
        Lesson lesson = getLesson(position);
        ((TextView) view.findViewById(R.id.lesson)).setText(lesson.lessonNumber);
        return view;
    }

    Lesson getLesson(int position){

        return ((Lesson)getItem(position));
    }
}
