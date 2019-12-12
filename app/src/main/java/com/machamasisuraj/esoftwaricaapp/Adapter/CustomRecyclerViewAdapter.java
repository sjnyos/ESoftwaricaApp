package com.machamasisuraj.esoftwaricaapp.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull studentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lsStudent.size();
    }


    public  class studentViewHolder extends RecyclerView.ViewHolder{

        public studentViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
