package app.ieee.ma.emsi.navdrawtest.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.astuetz.PagerSlidingTabStrip;

import app.ieee.ma.emsi.navdrawtest.R;
import app.ieee.ma.emsi.navdrawtest.wiki_fragment.Day1Fragment;
import app.ieee.ma.emsi.navdrawtest.wiki_fragment.Day2Fragment;
import app.ieee.ma.emsi.navdrawtest.wiki_fragment.Day3Fragment;
import app.ieee.ma.emsi.navdrawtest.wiki_fragment.Day4Fragment;


public class Planning extends AppCompatActivity {


    public static final String ARG_PAGE = "ARG_PAGE";


    FragmentPagerAdapter adapterViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_fragment);

        //initToolBar

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        // Get the ViewPager and set it's PagerAdapter so that it can display items
        ViewPager vPager = (ViewPager) findViewById(R.id.vp);
        adapterViewPager= new MyPagerAdapter(getSupportFragmentManager());
        vPager.setAdapter(adapterViewPager);
        // Give the PagerSlidingTabStrip the ViewPager
        PagerSlidingTabStrip tabsStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        // Attach the view pager to the tab strip
        tabsStrip.setViewPager(vPager);

        ;

    }



    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS =4;
        private String tabTitles[] = new String[] { "20/12", "21/12", "22/12","23/12" };
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position) {
                case 0:
                    return Day1Fragment.new_instance(position, "fragment 1");
                case 1:
                    return Day2Fragment.new_instance(position, "fragment 2");
                case 2:
                    return Day3Fragment.new_instance(position, "fragment 3");
                case 3:
                    return Day4Fragment.new_instance(position, "fragment 4");
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabTitles[position];
        }

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