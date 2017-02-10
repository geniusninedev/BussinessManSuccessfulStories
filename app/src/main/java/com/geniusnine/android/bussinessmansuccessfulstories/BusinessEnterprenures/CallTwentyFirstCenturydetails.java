package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;
//displays list of 21st century businessman enterpreneurs
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallTwentyFirstCenturydetails extends AppCompatActivity {

    ListView CallTwentyFirstCenturyListView;
    ArrayAdapter<String> adapter;
    String[] ListOfTwentyFirstcentury={"Brian Acton ","Charles T. Akre ","Rod Aldridge","Qais Al Khonji","Pierre Andurand ",
            "Steve Baxter","Joe Blackman","Ryan Blair "," Sara Blakely"," Sergey Brin ","Malcolm CasSelle",
            "Nancy Cruickshank","Mark Cuban ","Nick D'Aloisio  ","Jack Dorsey ","Shawn Fanning","Vishal Gondal ",
            "Reid Hoffman","Drew Houston ","Jessica Huie ","Elle Kaplan","David Karp ",
            "Sal Khan","Jan Koum","Jeremy Levitt","Ana Maiques","Fadi Makki","Strive Masiyiwa ",
            "Dave Morin","Elon Musk","Alexis Ohanian"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_twenty_first_centurydetails);
        CallTwentyFirstCenturyListView=(ListView)findViewById(R.id.TwentyFirstcenListId);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_call_twenty_first_centurydetails,R.id.twentyFirstcenTextView,ListOfTwentyFirstcentury);
        CallTwentyFirstCenturyListView.setAdapter(adapter);
        CallTwentyFirstCenturyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent CallTwentyCenturyPositionref=new Intent(CallTwentyFirstCenturydetails.this,CallTwentyFirstCenturydetailsView.class);
                CallTwentyCenturyPositionref.putExtra("key",position);
                startActivity(CallTwentyCenturyPositionref);
            }
        });
    }


}
