package com.example.continua02;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class HomeFragment extends Fragment {
    @Override
    public View onCreateView (@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.home_fragment, container, false);

        setUpToolbar(view);
        return  view;
    }
    private void setUpToolbar(View view){
        Toolbar toolbar = view.findViewById(R.id.app_menu);
        AppCompatActivity activity =(AppCompatActivity) getActivity();
        if(activity != null) {
            activity.setSupportActionBar(toolbar);
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate();

    }
}
