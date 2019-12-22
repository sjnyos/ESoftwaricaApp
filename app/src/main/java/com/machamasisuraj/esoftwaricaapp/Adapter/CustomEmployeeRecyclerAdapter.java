package com.machamasisuraj.esoftwaricaapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.machamasisuraj.esoftwaricaapp.R;
import com.machamasisuraj.esoftwaricaapp.models.Employee;

import java.util.List;

public class CustomEmployeeRecyclerAdapter extends RecyclerView.Adapter<CustomEmployeeRecyclerAdapter.EmployeeViewHolder> {
private List<Employee> employeeList;
private Context mContext;

    public CustomEmployeeRecyclerAdapter(List<Employee> employeeList, Context mContext) {
        this.employeeList = employeeList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_item,parent,false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        final Employee employee= employeeList.get(position);
        holder.text_id.setText(Integer.toString(employee.getId()));
        holder.text_name.setText("Name: "+employee.getEmployee_name());
        holder.text_age.setText( "Age :"+Integer.toString(employee.getEmployee_age()));
        holder.text_salary.setText("Salary :"+Float.toString(employee.getEmployee_salary()));

        holder.LinearLayouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, ""+employee.getId(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }


    public class EmployeeViewHolder extends ViewHolder{
        private TextView text_id,text_name,text_salary,text_age;
        private LinearLayout LinearLayouts;
        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            text_id= itemView.findViewById(R.id.text_id);
            text_name=itemView.findViewById(R.id.text_empname);
            text_age=itemView.findViewById(R.id.text_empage);
            text_salary=itemView.findViewById(R.id.text_empsalary);
            LinearLayouts = itemView.findViewById(R.id.LinearLayouts);
        }
    }
}
