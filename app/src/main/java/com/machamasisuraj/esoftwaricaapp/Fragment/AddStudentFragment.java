package com.machamasisuraj.esoftwaricaapp.Fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.machamasisuraj.esoftwaricaapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddStudentFragment extends Fragment {
    private Context mContext;

    public AddStudentFragment(Context mContext) {
        this.mContext=mContext;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_student, container, false);
    }

}
