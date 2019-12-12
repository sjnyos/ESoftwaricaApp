package com.machamasisuraj.esoftwaricaapp.Fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.machamasisuraj.esoftwaricaapp.Adapter.CustomRecyclerViewAdapter;
import com.machamasisuraj.esoftwaricaapp.R;
import com.machamasisuraj.esoftwaricaapp.models.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentListFragment extends Fragment {
    private RecyclerView recyclerView;
    private Context mContext;
    public StudentListFragment(Context mContext) {
        this.mContext=mContext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view= inflater.inflate(R.layout.fragment_student_list, container, false);

        recyclerView = view.findViewById(R.id.recyclerview);


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("suraj machamasi","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("ranjit basu","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("rita miss","addressone","female",20,R.drawable.girl));
        studentList.add(new Student("someone someone","other address","other",10,R.drawable.other));

        studentList.add(new Student("suraj machamasi","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("ranjit basu","bhaktapur","male",24,R.drawable.boy));
        studentList.add(new Student("rita miss","addressone","female",20,R.drawable.girl));
        studentList.add(new Student("someone someone","other address","other",10,R.drawable.other));

        CustomRecyclerViewAdapter customRecyclerViewAdapter = new CustomRecyclerViewAdapter(studentList,mContext);
        recyclerView.setAdapter(customRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

        return  view;


    }

}
