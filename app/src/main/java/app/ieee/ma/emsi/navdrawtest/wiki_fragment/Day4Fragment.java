package app.ieee.ma.emsi.navdrawtest.wiki_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import app.ieee.ma.emsi.navdrawtest.R;


public class Day4Fragment extends Fragment {

    private String _title;
    private int _position;



    // newInstance constructor for creating fragment with arguments
    public static Day4Fragment new_instance(int page , String title)
    {
        Day4Fragment fragment1 = new Day4Fragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment1.setArguments(args);
        return  fragment1;
    }



    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _position = getArguments().getInt("someInt",0);
        _title = getArguments().getString("someTitle");
    }

    // Inflate the view for the fragment based on layout XML

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.day4_fragment,container,false);


        return view;
    }

}
