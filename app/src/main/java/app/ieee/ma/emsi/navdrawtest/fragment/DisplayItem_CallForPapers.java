package app.ieee.ma.emsi.navdrawtest.fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.animation.OvershootInterpolator;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.classes.Commitee;
import app.ieee.ma.emsi.navdrawtest.viewHolder_class.ListCommitee_ViewHolder;
import jp.wasabeef.recyclerview.animators.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.animators.adapters.SlideInRightAnimationAdapter;


public class DisplayItem_CallForPapers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_for_papers);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);




        ListCFP();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.righttoleft_enter, R.anim.righttoleft_exit);
        //setResult(Activity.RESULT_OK, null);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == android.R.id.home)
        {
            finish();
            onBackPressed();
        }
        return   super.onOptionsItemSelected(item);
    }

    private void ListCFP() {

        //DATA

        Commitee CALLFORPAPERS[]=
                {
                        new Commitee("Circuits and Systems",
                                "> Analog and RF circuit design techniques.\n" +
                                        "> Digital signal and data processing.\n" +
                                        "> Wireless communication systems.\n" +
                                        "> Nonlinear circuits.\n" +
                                        "> System on chip (SoCs).\n" +
                                        "> VLSI for signal and image processing.\n" +
                                        "> Integrated antenna and front-end co-design.\n" +
                                        "> Signal processing in communication.\n" +
                                        "> Digital image processing applications.\n" +
                                        "> Biomedical circuits and systems."
                                ),
                        new Commitee("CAD Tools and Design",
                                "> Simulation (process‚ device‚ circuit‚ logic‚ timing‚ function).\n" +
                                        "> Layout (placement‚ routing‚ floor planning‚ symbolic‚ ERC‚ DRC).\n" +
                                        "> Silicon optimization.\n" +
                                        "> Parallel embedded systems.\n" +
                                        "> Testing: Formal verification.\n" +
                                        "> CAD for FPGAs.\n" +
                                        "> High-level synthesis tools.\n" +
                                        "> Design for testability.")
                        ,new Commitee("Micro/Nanoelectronics",
                        "> Device characterization and modelling.\n" +
                                "> Device physics and novel structures.\n" +
                                "> Process technology‚ CMOS‚ BJT.\n" +
                                "> BiCMOS‚ GaAs.\n" +
                                "> Reliability and failure analysis.\n" +
                                "> Optoelectronics.\n" +
                                "> MEMS devices.\n" +
                                "> Packaging and surface mount technology."
                ),new Commitee("Special Sessions",
                        "> Smart sensors and sensor networks.\n" +
                                "> Biomedical.\n" +
                                "> Renewable energy sources.\n" +
                                "> Complex systems.")
                };

        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_callForPapers);
        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // 3. create an adapter
        ListCommitee_ViewHolder mAdapter = new ListCommitee_ViewHolder(CALLFORPAPERS);
        // 4. set adapter
        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(mAdapter);
        alphaAdapter.setDuration(2000);
        alphaAdapter.setInterpolator(new OvershootInterpolator());
        alphaAdapter.setFirstOnly(false);
        recyclerView.setAdapter(new SlideInRightAnimationAdapter(mAdapter));

    }


}
