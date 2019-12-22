package com.machamasisuraj.esoftwaricaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.machamasisuraj.esoftwaricaapp.Fragment.AboutUsFragment;
import com.machamasisuraj.esoftwaricaapp.Fragment.AddStudentFragment;
import com.machamasisuraj.esoftwaricaapp.Fragment.EmployeeFragment;
import com.machamasisuraj.esoftwaricaapp.Fragment.StudentListFragment;

public class BottomNavActivity extends AppCompatActivity {
    private BottomNavigationView bottomnavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        bottomnavigation = findViewById(R.id.bottomnavigation);
        bottomnavigation.setSelectedItemId(R.id.navigation_home);

        getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, new StudentListFragment(getApplicationContext())).commit();

        bottomnavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

               switch (menuItem.getItemId()){
                   case R.id.navigation_home:
                       {
                       StudentListFragment studentListFragment = new StudentListFragment(getApplicationContext());
                       fragmentTransaction.replace(R.id.frame_container,studentListFragment);
                       fragmentTransaction.addToBackStack(null);
                       fragmentTransaction.commit();
                       return true;
                       }
                   case  R.id.navigation_addstudent:{
                       AddStudentFragment addStudentFragment= new AddStudentFragment(getApplicationContext());
                       fragmentTransaction.replace(R.id.frame_container,addStudentFragment);
                       fragmentTransaction.addToBackStack(null);
                       fragmentTransaction.commit();
                       return true;}
                   case R.id.navigation_aboutus:{
                       AboutUsFragment aboutUsFragment= new AboutUsFragment(getApplicationContext());
                       fragmentTransaction.replace(R.id.frame_container,aboutUsFragment);
                       fragmentTransaction.addToBackStack(null);
                       fragmentTransaction.commit();
                       return true;}
                   case R.id.navigation_employee:{
                       EmployeeFragment employeeFragment= new EmployeeFragment(getApplicationContext());
                       fragmentTransaction.replace(R.id.frame_container,employeeFragment);
                       fragmentTransaction.addToBackStack(null);
                       fragmentTransaction.commit();
                       return true;}

                   default: return false;

               }
            }
        });

    }
}
