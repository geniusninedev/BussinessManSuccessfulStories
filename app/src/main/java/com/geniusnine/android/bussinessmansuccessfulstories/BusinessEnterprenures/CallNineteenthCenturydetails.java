package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;

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

public class CallNineteenthCenturydetails extends AppCompatActivity {
ListView NineteenthcenturyListview;
    ArrayAdapter<String> adapter;
    String[] Nineteenthcenturylist={"Andrew Carnegie ","Biddy Mason ","Charles T. Hinde ","Cornelius Vanderbilt ",
            "Eugene Sharrer ","John Jacob Astor ","Joseph Seligman ","James Buchanan Duke ","J. P. Morgan ","Jamsetji Tata ","John D. Rockefeller ","Leland Stanford ","Nikola Tesla",
            "Richard Trevithick ","Thomas Alva Edison","Levi Strauss"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_nineteenth_centurydetails);
        NineteenthcenturyListview=(ListView)findViewById(R.id.NineteenthcenturyListview);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_call_nineteenth_centurydetails,R.id.nineteenthcentextview,Nineteenthcenturylist);
        NineteenthcenturyListview.setAdapter(adapter);
        NineteenthcenturyListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent CallNineteenthcenturydetailsview=new Intent(CallNineteenthCenturydetails.this,CallNineteenthcenturyDetailview.class);
                CallNineteenthcenturydetailsview.putExtra("key",position);
                startActivity(CallNineteenthcenturydetailsview);
            }
        });
    }

}
