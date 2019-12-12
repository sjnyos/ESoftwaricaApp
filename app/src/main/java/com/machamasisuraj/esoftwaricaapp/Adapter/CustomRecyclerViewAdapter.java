package com.machamasisuraj.esoftwaricaapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.machamasisuraj.esoftwaricaapp.R;
import com.machamasisuraj.esoftwaricaapp.models.Student;

import java.util.List;

public class CustomRecyclerViewAdapter  extends RecyclerView.Adapter<CustomRecyclerViewAdapter.studentViewHolder> {

    private List<Student> lsStudent;
    private Context mContext;

    public CustomRecyclerViewAdapter(List<Student> lsStudent, Context mContext) {
        this.lsStudent = lsStudent;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public studentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item_layout,parent,false);
       return  new studentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull studentViewHolder holder, int position) {
        Student student = lsStudent.get(position);
        holder.textView.setText(student.getFullName());
        holder.textView2.setText( Integer.toString(student.getAge()));
        holder.textView3.setText(student.getAddress());
        holder.textView4.setText(student.getGender());
        holder.imageView.setImageResource(student.getImageid());
    }

    @Override
    public int getItemCount() {
        return lsStudent.size();
    }


    public  class studentViewHolder extends RecyclerView.ViewHolder{

        private TextView textView,textView2,textView3,textView4;
        private ImageView imageView;
        private ImageButton imageButton;

        public studentViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
            textView3 = itemView.findViewById(R.id.textView3);
            textView4 = itemView.findViewById(R.id.textView4);
            imageView = itemView.findViewById(R.id.imageView);
            imageButton = itemView.findViewById(R.id.imageButton);
        }
    }
}
