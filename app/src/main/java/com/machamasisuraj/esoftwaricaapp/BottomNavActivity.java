package com.machamasisuraj.esoftwaricaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.machamasisuraj.esoftwaricaapp.Fragment.StudentListFragment;

public class BottomNavActivity extends AppCompatActivity {
    private BottomNavigationView bottomnavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);

        bottomnavigation = findViewById(R.id.bottomnavigation);
        bottomnavigation.setSelectedItemId(R.id.navigation_home);
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
                       Toast.makeText(BottomNavActivity.this, "home", Toast.LENGTH_SHORT).show();
                       return true;
                       }
                   case  R.id.navigation_addstudent:
                       Toast.makeText(BottomNavActivity.this, "add student", Toast.LENGTH_SHORT).show();
                       return true;
                   case R.id.navigation_aboutus:
                       Toast.makeText(BottomNavActivity.this, "aboutus", Toast.LENGTH_SHORT).show();
                       return true;

                   default: return false;

               }
            }
        });

    }
}
