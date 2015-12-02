package app.ieee.ma.emsi.navdrawtest;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.pnikosis.materialishprogress.ProgressWheel;


public class LaunchScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_launcher);

        new BackgroundTask().execute();

    }


    private class BackgroundTask extends AsyncTask
    {
        private static final int  SPLACH_TIME = 4000 ;
        Intent intent;

        @Override
        protected Object doInBackground(Object[] params) {

            try {
                Thread.sleep(SPLACH_TIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return  null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);

            startActivity(intent);
            finish();
        }


        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            ProgressWheel wheel = new ProgressWheel(getApplicationContext());
            wheel.setBarColor(Color.BLUE);

            intent = new Intent(getApplicationContext(),MainActivity.class);
        }
    }


}

