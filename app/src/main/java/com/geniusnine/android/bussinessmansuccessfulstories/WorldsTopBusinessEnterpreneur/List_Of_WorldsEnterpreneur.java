package com.geniusnine.android.bussinessmansuccessfulstories.WorldsTopBusinessEnterpreneur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures.CallEigthteenthCenturydetails;
import com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures.CallNineteenthCenturydetails;
import com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures.CallTwentyCenturydetails;
import com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures.CallTwentyFirstCenturydetails;
import com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures.List_Of_Businessman_Enterpreneur;
import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class List_Of_WorldsEnterpreneur extends AppCompatActivity {

    ListView calWorldsBusinessmanListView;
    ArrayAdapter<String> adapter;
    String[] ListOfWorldsBusinessManEnterpreneur={"Carlos Slim Helu","Warren Buffett","Amancio Ortega","Larry Ellison",
            "The Koch Brothers","Richard Branson","Sheldon Adelson","The Walton Family",
            "Amadeo Giannini","Liliane  Bettencourt","Steve Wozniak","Li Ka Shing","Michael Bloomberg",
            " Michael Dell"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__of__worlds_enterpreneur);
        calWorldsBusinessmanListView=(ListView)findViewById(R.id.CallListOfworldsBusinessmanEnterpreneur);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_list__of__worlds_enterpreneur,R.id.WorldsBusinessmanTextViewLayout,ListOfWorldsBusinessManEnterpreneur);
        calWorldsBusinessmanListView.setAdapter(adapter);
        calWorldsBusinessmanListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent WorldsEnterpreneurZeropositionRef=new Intent(List_Of_WorldsEnterpreneur.this,CallWorldsEnterpreneurDetailsView.class);
                    WorldsEnterpreneurZeropositionRef.putExtra("key",position);
                    startActivity(WorldsEnterpreneurZeropositionRef);

            }
        });
    }


}
