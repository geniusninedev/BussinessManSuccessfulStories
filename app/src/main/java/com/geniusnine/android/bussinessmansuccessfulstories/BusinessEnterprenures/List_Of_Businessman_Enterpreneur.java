package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;
//displaying information of enterpreneur according to theur century
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class List_Of_Businessman_Enterpreneur extends AppCompatActivity {
ListView calBusinessmanListView;
    ArrayAdapter<String> adapter;
   String[] ListOfBusinessManEnterpreneur={"18th Century BusinessMan List","19th Century BusinessMan List","20th Century BusinessMan List","21st Century BusinessMan List"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__of__businessman__enterpreneur);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        calBusinessmanListView=(ListView)findViewById(R.id.CallListOfBusinessmanEnterpreneur);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_list__of__businessman__enterpreneur,R.id.BusinessmanTextViewLayout,ListOfBusinessManEnterpreneur);
       calBusinessmanListView.setAdapter(adapter);
        calBusinessmanListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                     Intent ZeropositionRef=new Intent(List_Of_Businessman_Enterpreneur.this,CallEigthteenthCenturydetails.class);
                    startActivity(ZeropositionRef);
                }
                if(position==1){
                    Intent FirstpositionRef=new Intent(List_Of_Businessman_Enterpreneur.this,CallNineteenthCenturydetails.class);
                    startActivity(FirstpositionRef);
                }
                if(position==2){
                    Intent FirstpositionRef=new Intent(List_Of_Businessman_Enterpreneur.this,CallTwentyCenturydetails.class);
                    startActivity(FirstpositionRef);
                }
                if(position==3){
                    Intent FirstpositionRef=new Intent(List_Of_Businessman_Enterpreneur.this,CallTwentyFirstCenturydetails.class);
                    startActivity(FirstpositionRef);
                }
            }
        });
    }




}

