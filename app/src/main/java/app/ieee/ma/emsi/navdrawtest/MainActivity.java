package app.ieee.ma.emsi.navdrawtest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;

import app.ieee.ma.emsi.navdrawtest.fragment.DisplayItem_CallForPapers;
import app.ieee.ma.emsi.navdrawtest.fragment.DisplayItem_Commitee;
import app.ieee.ma.emsi.navdrawtest.fragment.DisplayItem_Person;
import app.ieee.ma.emsi.navdrawtest.fragment.GeneralInfo;
import app.ieee.ma.emsi.navdrawtest.fragment.Planning;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private SliderLayout mDemoSlider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //ADD ICON TO ACTION BAR

       /* ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setIcon(R.mipmap.ic_launcher);
        */

        View includedLayout = findViewById(R.id.bar_main_call);
        View includedLayout2 = includedLayout.findViewById(R.id.content_main_call);

        mDemoSlider = (SliderLayout) includedLayout2.findViewById(R.id.slider);
        HashMap<String,String> url_maps = new HashMap<String, String>();
        url_maps.put("UNIVERSITE DE LORRAINE", "http://www.ieeeicm2015.org/wp-content/uploads/2015/06/lorraine.jpg");
        url_maps.put("EMSI", "http://www.ieeeicm2015.org/wp-content/uploads/2015/06/emsi.jpg");
        url_maps.put("CAS", "http://www.ieeeicm2015.org/wp-content/uploads/2015/06/cas.jpg");
        url_maps.put("UNIVERSITY OF WATERLOO", "http://www.ieeeicm2015.org/wp-content/uploads/2015/06/waterloo.jpg");
        url_maps.put("POLYTECHNIQUE MONERAL ", "http://www.ieeeicm2015.org/wp-content/uploads/2015/06/polytechnique.jpg");

        for(String name : url_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(includedLayout.getContext());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(url_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit);

            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);
        }
        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(5000);


        RelativeLayout date_layout =  (RelativeLayout) includedLayout2.findViewById(R.id.date_layout);
        date_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Planning.class);
                startActivity(intent);
                overridePendingTransition(R.anim.lefttoright_enter, R.anim.lefttoright_exit);

            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {

            Intent intent = new Intent(getApplicationContext(), DisplayItem_CallForPapers.class);
            startActivity(intent);
            overridePendingTransition(R.anim.lefttoright_enter, R.anim.lefttoright_exit);
        } else if (id == R.id.nav_gallery) {

            Intent intent = new Intent(getApplicationContext(), DisplayItem_Person.class);
            startActivity(intent);
            overridePendingTransition(R.anim.lefttoright_enter,R.anim.lefttoright_exit);

        } else if (id == R.id.nav_committee) {

            Intent intent = new Intent(getApplicationContext(), DisplayItem_Commitee.class);
            startActivity(intent);
            overridePendingTransition(R.anim.lefttoright_enter, R.anim.lefttoright_exit);


        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(getApplicationContext(), GeneralInfo.class);
            startActivity(intent);
            overridePendingTransition(R.anim.lefttoright_enter, R.anim.lefttoright_exit);

        } else if (id == R.id.planning) {
            Intent intent = new Intent(getApplicationContext(), Planning.class);
            startActivity(intent);
            overridePendingTransition(R.anim.lefttoright_enter, R.anim.lefttoright_exit);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
