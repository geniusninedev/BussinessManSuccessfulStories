package com.geniusnine.android.bussinessmansuccessfulstories;
//calling listofbusinessman enterprenure package and the list

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures.List_Of_Businessman_Enterpreneur;
import com.geniusnine.android.bussinessmansuccessfulstories.IndiaTopEnterpreneurs.List_Of_IndianEnterpreneurs;
import com.geniusnine.android.bussinessmansuccessfulstories.WorldsTopBusinessEnterpreneur.List_Of_WorldsEnterpreneur;
import com.geniusnine.android.bussinessmansuccessfulstories.List_Of_MotivationalStories.List_Of_Motivational_Stories;
import com.geniusnine.android.bussinessmansuccessfulstories.Quotes.QuotesList;
import  com.geniusnine.android.bussinessmansuccessfulstories.IntroductionView.Introduction;


public class MainActivity extends AppCompatActivity
         {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/


    }

    public void callBusinessEnterprenuresIndex(View view){
        Intent ListOfBusinessmanEnterpreneur=new Intent(MainActivity.this,List_Of_Businessman_Enterpreneur.class);
        startActivity(ListOfBusinessmanEnterpreneur);
    }
    public void callWorldsTopBusinessEnterprenuresIndex(View view){
        Intent ListOfWorldsEnterpreneurEnterpreneur=new Intent(MainActivity.this,List_Of_WorldsEnterpreneur.class);
        startActivity(ListOfWorldsEnterpreneurEnterpreneur);
    }
    public void callWorldsTopBusinessEnterprenuresIntroduction(View view){
        Intent ListOfWorldsEnterpreneurEnterpreneur=new Intent(MainActivity.this,Introduction.class);
        startActivity(ListOfWorldsEnterpreneurEnterpreneur);
    }
    public void callMotivationalStorieIndex(View view){
        Intent ListOfMotivationalStories=new Intent(MainActivity.this,List_Of_Motivational_Stories.class);
        startActivity(ListOfMotivationalStories);
    }
    public void callIndiaTopEnterpreneursindex(View view){
        Intent ListOfIndianEnterpreneur=new Intent(MainActivity.this,List_Of_IndianEnterpreneurs.class);
        startActivity(ListOfIndianEnterpreneur);
    } public void callQuotes(View view){
        Intent ListOfIndianEnterpreneur=new Intent(MainActivity.this,QuotesList.class);
        startActivity(ListOfIndianEnterpreneur);
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
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch(keyCode){
            case KeyEvent.KEYCODE_BACK:
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("Are you sure you want to close App?");
                alertDialogBuilder.setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {

                                finish();

                            }
                        });

                alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {


                    }
                });

                //Showing the alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
                return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/
        if (id == R.id.nav_share1) {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT, "message to share");
            startActivity(Intent.createChooser(i, "Share via"));
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
