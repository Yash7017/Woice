package com.example.woice.ui.home;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.woice.Collect;
import com.example.woice.HomeWatcher;
import com.example.woice.MusicService;
import com.example.woice.Play;
import com.example.woice.Progress;
import com.example.woice.R;
import com.example.woice.Scene1;

public class HomeFragment extends Fragment  {

    ImageView play;
    CardView collect,progress;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
        play= root.findViewById(R.id.gamestart);
        collect=root.findViewById(R.id.collect);
        progress=root.findViewById(R.id.progress);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Scene1.class);
                startActivity(intent);

            }
        });
        collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Collect.class);
                startActivity(intent);

            }
        });
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), Progress.class);
                startActivity(intent);

            }
        });


        return root;


    }




   /* @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gamestart:
                Intent intent=new Intent(getActivity(),Scene1.class);
                startActivity(intent);
                break;
        }

    }*/
}
