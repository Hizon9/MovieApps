package com.example.movieapps.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.movieapps.FetchDataSeries;
import com.example.movieapps.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    public static TextView data;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        data = (TextView) root.findViewById(R.id.text_dashboard);
        FetchDataSeries process = new FetchDataSeries();
        process.execute();
        //final TextView textView = root.findViewById(R.id.text_dashboard);
        //.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            //@Override
            //public void onChanged(@Nullable String s) {
                //textView.setText(s);
            //}
        //});
        return root;
    }
}