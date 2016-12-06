package com.abbisqq.recyclerlistviewinfragment.ui;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.abbisqq.recyclerlistviewinfragment.R;
import com.abbisqq.recyclerlistviewinfragment.fragments.BlankFragment;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);


        if(fragment==null){
            fragment = new BlankFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();

        }



    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
