package com.example.bottomappbarnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout cordi;
    BottomAppBar BottomAppBar;
    FrameLayout frame;

    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomAppBar=findViewById(R.id.BottomAppBar);
        frame=findViewById(R.id.frame);
        linear=findViewById(R.id.linear);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                replace(new BlankFragment());

            }
        });

    }

    void replace(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frame, fragment);
        ft.commit();
    }

}