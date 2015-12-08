package app.ieee.ma.emsi.navdrawtest.wiki_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Planing;
import app.ieee.ma.emsi.navdrawtest.viewHolder_class.Planing_ViewHolder;
import jp.wasabeef.recyclerview.animators.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.SlideInRightAnimationAdapter;


public class Day2Fragment extends Fragment {

    private String _title;
    private int _position;



    // newInstance constructor for creating fragment with arguments
    public static Day2Fragment new_instance(int page , String title)
    {
        Day2Fragment fragment1 = new Day2Fragment();
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

        View view = inflater.inflate(R.layout.day2_fragment,container,false);

        PlaningItems(view);
        return view;
    }



    private  void PlaningItems(View v)
    {
        Planing[] listPlaning2 = {
                new Planing("08:00 - 09:00","Registration","Main hall"),
                new Planing("09:00 - 10:30","Opening Ceremony + Keynote 1 (Pr. Patrick Girard)","Plenary Room"),
                new Planing("10:30 - 11:00","Coffee Break","Main hall"),
                new Planing("11:00 - 12:30","S1 Circuits and Systems","Plenary Room"),
                new Planing("11:00 - 12:30","S1 CAD Tools and Design","Room CHALLA"),
                new Planing("11:00 - 12:30","SS1 S.Smart Sensor and Sensor Network","Room KOUTOUBIA"),
                new Planing("12:30 - 14:00","Lunch Break","Main hall"),
                new Planing("14:00 - 15:30","S2 Circuits and Systems","Plenary Room"),
                new Planing("14:00 - 15:30","S1 Micro/Nanoelctronics","Room CHALLA"),
                new Planing("14:00 - 15:30","SS2 S. complex Systems","Room KOUTOUBIA"),
                new Planing("15:30 - 16:00","Coffee Break","Main hall"),
                new Planing("16:00 - 17:30","S3 Circuits and Systems","Plenary Room"),
                new Planing("16:00 - 17:30","S2 CAD Tools and Design","Room CHALLA"),
                new Planing("16:00 - 17:30","SS3 S. Session Biomedical","Room KOUTOUBIA")
        };

        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.rv2_planing);
        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        // 3. create an adapter
        Planing_ViewHolder mAdapter = new Planing_ViewHolder(listPlaning2);
        // 4. set adapter
        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(mAdapter);
        alphaAdapter.setDuration(2000);
        alphaAdapter.setInterpolator(new OvershootInterpolator());
        alphaAdapter.setFirstOnly(false);
        recyclerView.setAdapter(new SlideInRightAnimationAdapter(mAdapter));
    }

}
