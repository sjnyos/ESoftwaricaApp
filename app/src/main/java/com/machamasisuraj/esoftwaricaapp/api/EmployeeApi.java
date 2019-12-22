package com.machamasisuraj.esoftwaricaapp.api;

import com.machamasisuraj.esoftwaricaapp.models.Employee;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EmployeeApi {

    @GET("employees")
    Call<List<Employee>> GetAllEmployee();

}
