package app.ieee.ma.emsi.navdrawtest.fragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import app.ieee.ma.emsi.navdrawtest.R;


public class Keynotes_frame extends ActionBarActivity {


    TextView name,title,desscription;
    ImageView image ;
    private  int position = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_frame);

        //initToolBar

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        name = (TextView) findViewById(R.id.keynotes_title);
        title = (TextView) findViewById(R.id.keynotes_sub_title);
        image =(ImageView) findViewById(R.id.keynotes_img);
        desscription = (TextView) findViewById(R.id.keynotes_description);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {  position = Integer.parseInt(bundle.getString("position"));
            /*Toast.makeText(getApplicationContext(),position+"",Toast.LENGTH_LONG).show();*/
        }



          getViewFromPosition(position);


    }


    public void getViewFromPosition(int pos)
    {
        if(pos == 0)
        {
            name.setText("Patrick Girard");
            title.setText("Keynote Title : Test of Low Power Devices  « Constraints and Industrial Practices »");
            image.setImageResource(R.drawable.pg);
            desscription.setText(R.string.keynotes_desc_1);

        }else if(pos == 1)
        {
            name.setText("Jean-Michel Sallese");
            title.setText("Keynote Title : Principle of Junctionless Field Effect Transistors");
            image.setImageResource(R.drawable.jms);
            desscription.setText(R.string.keynotes_desc_2);
        }else
        {
            name.setText("Hicham Bouzekri");
            title.setText("Keynote Title : Microelectronics in Morocco « Lessons learned & perspectives »");
            image.setImageResource(R.drawable.hb1);
            desscription.setText(R.string.keynotes_desc_3);
        }

    }
    public void initToolbar()
    {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_action_ieee);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
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
}

