package com.example.fx50j.lesson2;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.util.LayoutDirection;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FX50J on 2015/12/8.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    private int resourceId;
    public StudentAdapter(Context context,int textViewResourceId,List<Student>object){
        super(context,textViewResourceId,object);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Student student = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView studentImage = (ImageView)view.findViewById(R.id.Iv21);
        TextView studentName = (TextView)view.findViewById(R.id.Tv21);
        studentImage.setImageResource(student.getImageId());
        studentName.setText(student.getName());
        return view;
    }

}
