package com.machamasisuraj.esoftwaricaapp.Fragment;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.ConditionVariable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.machamasisuraj.esoftwaricaapp.Adapter.CustomEmployeeRecyclerAdapter;
import com.machamasisuraj.esoftwaricaapp.R;
import com.machamasisuraj.esoftwaricaapp.api.EmployeeApi;
import com.machamasisuraj.esoftwaricaapp.models.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmployeeFragment extends Fragment {

    private RecyclerView recyclerView;
    private Context mContext;
    private List<Employee> employeeList;
    public EmployeeFragment(Context mContext) {
        this.mContext=mContext;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_employee, container, false);
        recyclerView= view.findViewById(R.id.employee_recyclerlist);
        Caller();




        return view;
    }

    private void Caller(){
        //asynchronous retrofit calls
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://dummy.restapiexample.com/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final EmployeeApi employeeAPI = retrofit.create(EmployeeApi.class);

        Call<List<Employee>> listCall = employeeAPI.GetAllEmployee();

        listCall.enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(mContext, "Code Error:"+ response.code(), Toast.LENGTH_SHORT).show();
                    return;
                }
                employeeList = response.body();
                CustomEmployeeRecyclerAdapter customEmployeeRecyclerAdapter= new CustomEmployeeRecyclerAdapter(employeeList,mContext);
                recyclerView.setAdapter(customEmployeeRecyclerAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(mContext));

            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {
                Log.d("err msg","onFailure :"+t.getLocalizedMessage());
                Toast.makeText(mContext, "Error "+ t.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }



}
