package app.ieee.ma.emsi.navdrawtest.fragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
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


public class DisplayItem_Commitee extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.committee_list);

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        ListCommittee();

    }

   /* public void initToolbar()
    {
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_white);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }*/

    public void ListCommittee()
    {


        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_committee);
        recyclerView.setHasFixedSize(true);

        Commitee commitee[] =
                {
                        new Commitee("General Co-chairs",
                                " * Mohamad Sawan, Polytechnique Montréal Canada\n" +
                                " * Kamal Daissaoui, EMSI Morocco"),
                        new Commitee("Honorary Co-chairs",
                                "* Mohamed El Massry, University of Waterloo Canada\n" +
                                        "* Driss Aboutajdine, CNRST Morocco"),
                        new Commitee("Technical Program Co-chairs",
                                "* Fabrice Monteiro, UL France\n" +
                                        "* Mohamed Tabaa, EMSI Morocco\n" +
                                        "* Fouad El Haj Hassan, UL Liban"),
                        new Commitee("Plenary Talk co-Chairs",
                                "* Luc Hebrard, US France\n" +
                                        "* Said Belkouch, UCI Morocco"),
                        new Commitee("Special Sessions co-Chairs",
                                "* Abbas Dandache, UL France\n" +
                                        "* Haitham Zaraket, UL Liban"),
                        new Commitee("Technical Program Co-chairs",
                                "* Fabrice Monteiro, UL France\n" +
                                        "* Mohamed Tabaa, EMSI Morocco\n" +
                                        "* Fouad El Haj Hassan, UL Liban"),
                        new Commitee("Tutorials co-Chairs",
                                "* Patrick Girard, LIRMM France\n" +
                                        "* Omar Bouattane, UNIVH2M Morocco\n" +
                                        "* Ali Siadat, ENSAM France"),
                        new Commitee("Panels co-Chairs",
                                "* M’hamed Drissi, INSA France\n" +
                                        "* Hafid Griguer, EMSI Morocco"),
                        new Commitee("Industry Liaison co-Chairs",
                                "* Dominique Sauter, CRAN France\n" +
                                        "* Nouredinne Bouayaakoub, CE3M Morocco\n" +
                                        "* Hicham Rhioui, IM Morocco"),
                        new Commitee("Publicity co-Chairs",
                                "* Emmanuel Simeu, TIMA France\n" +
                                        "Aurélia Picod, EMSI Morocco\n" +
                                        "Abdellah Ailane, ENSAK Morocco"),
                        new Commitee("Publication co-Chairs",
                                "* Brahim El Bhiri, EMSI Morocco\n" +
                                        "* Khadija Bousmar, EMSI Morocco"),
                        new Commitee("Finance Chair",
                                "* Jaouad Khayat, EMSI Morocco"),
                        new Commitee("Local Arrangement co-Chairs",
                                "*Karim Alami, EMSI Morocco\n" +
                                        "Abdellah Daissaoui, EMSI Morocco\n" +
                                        "Lamia Faouzi, EMSI Morocco\n" +
                                        "Zouhair Benabbou, EMSI Morocco\n" +
                                        "Fatmi Bergach, EMSI Morocco"),
                        new Commitee("International Coordinators",
                                "*Abdoul Rjoub, Jordan\n" +
                                        "Khalid Salama, KSA\n" +
                                        "Abbes Amira, Qatar\n" +
                                        "Mohab Anis, Egypt\n" +
                                        "Mohamed Masmoudi, Tunisia\n" +
                                        "Mountassar Maamooun, Algeria\n" +
                                        "Falah Awwad, Abou Dhabi"),


                        new Commitee("Program Comittee",
                                "*Karim Alami, EMSI Morocco\n" +
                                        "* Abdellah Ailane, ENSAK Morocco\n" +
                                        "* Hafid Ait El Mahjoub, ENSAM Morocco\n" +
                                        "* Abbes Amira, Qatar\n" +
                                        "* Mohab Anis, Egypt\n" +
                                        "* Blaise Angome, EMSI Morocco\n" +
                                        "* Ouassama Bazzi, UL Lebenon\n" +
                                        "* Said Belkouch, UCI Morocco\n" +
                                        "* Hervé Berviller, US France\n" +
                                        "* Azzedine Boulmaakoul, UNIVH2M Morocco\n" +
                                        "* Mohammad Benhmida, UCD France\n" +
                                        "* Omar Bouattane, UNIVH2M Morocco\n" +
                                        "* Bouchaib Bounabate, ENSIAS Morocco\n" +
                                        "* Amer Baghdadi, ENSTP France\n" +
                                        "* Samir Chafik, EMSI Morocco\n" +
                                        "* Mountassar Maamooun, Algeria\n" +
                                        "* M’hammed Drissi, INSA France\n" +
                                        "* Abbas Dandache, UL France\n" +
                                        "* Sofiene Dellagy, UL France\n" +
                                        "* Mohamed El Aroussi, EHTP Morocco\n" +
                                        "* Sanaa El Filali, UNIVH2C Morocco\n" +
                                        "* Khalifa El Mansouri, UNIVH2M Morocco\n" +
                                        "* Mohamed El Massry, Univ of Waterloo Canada\n" +
                                        "* Brahim EL Bhiri, EMSI Morocco\n" +
                                        "Fouad El Haj Hassan, UL Lebanon\n" +
                                        "Oussama El issati, INPT Morocco\n" +
                                        "Moanisse Fadlala, UL Lebanon\n" +
                                        "Hafid Griguer, EMSI Morocco\n" +
                                        "Patrick Girard, LIRMM France\n" +
                                        "Abdellatif Hamdoun, UC Morocco\n" +
                                        "Ali Hamia, UL Lebenon\n" +
                                        "Luc Hebrard, US France\n" +
                                        "Jalal Jomaa, UL Lebenon\n" +
                                        "Ahmed Khadimi, INPT Morocco\n" +
                                        "Abdelhakim Khatabe, ENIM France\n" +
                                        "Djilali Kourtiche, UL France\n" +
                                        "Hicham Lalaj, EMSI Morocco\n" +
                                        "Erebe Lebrevere, US France\n" +
                                        "Fabrice Monteiro, UL France\n" +
                                        "Mohamed Masmoudi, Tunisia\n" +
                                        "Rachid Oulad Haj Thami, ENSIAS Morocco\n" +
                                        "Mohamed Ramdani, FSTM Morocco\n" +
                                        "Hassan Rabah, UL France\n" +
                                        "Abdoul Rjoub, Jordan\n" +
                                        "Mohamed Sawan, Polytechnique Montréal Canada\n" +
                                        "Khalid Salama, KSA\n" +
                                        "Rachid Saadane, EHTP Morocco\n" +
                                        "Nathalie Sauer, UL France\n" +
                                        "Dominique Sauter, UL France\n" +
                                        "Ali Siadat, ENSAM France\n" +
                                        "Christophe Sauver, UL France\n" +
                                        "Emmanuel Simeu, TIMA France\n" +
                                        "Mohamed Tabaa, EMSI Morocco\n" +
                                        "Nidal Rezg, UL France\n" +
                                        "Kaikai Xu, UESTC China\n" +
                                        "Haitham Zaraket, UL Lebanon\n" +
                                        "Mourad Zegrari, ENSAM Morocco"),

                };


        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        // 3. create an adapter
        ListCommitee_ViewHolder mAdapter = new ListCommitee_ViewHolder(commitee);
        // 4. set adapter
        AlphaInAnimationAdapter alphaAdapter = new AlphaInAnimationAdapter(mAdapter);
        //alphaAdapter.setDuration(2000);
        alphaAdapter.setInterpolator(new OvershootInterpolator());
        alphaAdapter.setFirstOnly(false);
        recyclerView.setAdapter(new SlideInRightAnimationAdapter(mAdapter));
        // 5. set item animator
        //recyclerView.setItemAnimator(new FlipInRightYAnimator());

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
