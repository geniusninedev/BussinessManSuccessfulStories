package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;
//displaying list of 18th century details
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallEigthteenthCenturydetails extends AppCompatActivity {

    ListView Eighteenthcenturylist;
    ArrayAdapter<String> adapter;
    String[] ListOfEighteenthCenturyEnterpreneur={"Anna Elisabeth Baer ","James Watt ","Samuel Crompton ","Thomas Newcomen ","Claus Spreckels ","Johns Hopkins "};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__of__businessman__enterpreneur);
        Eighteenthcenturylist=(ListView)findViewById(R.id.CallListOfBusinessmanEnterpreneur);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_call_eigthteenth_centurydetails,R.id.eighteenthcenturyTextViewLayout,ListOfEighteenthCenturyEnterpreneur);
        Eighteenthcenturylist.setAdapter(adapter);
        Eighteenthcenturylist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(CallEigthteenthCenturydetails.this,CallEighteenthCenturyFiles.class);
                i.putExtra("key",position);
                startActivity(i);
            }
        });

    }

}

