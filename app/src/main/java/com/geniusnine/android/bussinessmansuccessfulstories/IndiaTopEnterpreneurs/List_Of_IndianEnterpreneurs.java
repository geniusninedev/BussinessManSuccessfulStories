package com.geniusnine.android.bussinessmansuccessfulstories.IndiaTopEnterpreneurs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.bussinessmansuccessfulstories.List_Of_MotivationalStories.CallMotivationalDetailsView;
import com.geniusnine.android.bussinessmansuccessfulstories.List_Of_MotivationalStories.List_Of_Motivational_Stories;
import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class List_Of_IndianEnterpreneurs extends AppCompatActivity {

    ListView CallIndianTopList;
    ArrayAdapter<String> adapter;
    String[] CallIndianTopEnterpreneurList={"Achyuta Samanta","Ajay Piramal, Swati Piramal","Anand Mahindra","Anil Agarwal",
            "Ashok Soota ","Azim Premji","Baba Kalyani","Brijmohan Lall Munjal ",
            "Chirag Kulkarni","Cyrus Vandrevala","Dilip Sanghvi","Faisal Farooqui","G. R. Gopinath",
            "Gautam Thapar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__of__indian_enterpreneurs);
        CallIndianTopList=(ListView)findViewById(R.id.CallListOfIndiaenterpreneur);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_list__of__indian_enterpreneurs,R.id.TopIndiaEnterpreneuTextViewLayout,CallIndianTopEnterpreneurList);
        CallIndianTopList.setAdapter(adapter);
        CallIndianTopList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent WorldsEnterpreneurZeropositionRef=new Intent(List_Of_IndianEnterpreneurs.this,CallIndianEnterpreneurDetails.class);
                WorldsEnterpreneurZeropositionRef.putExtra("key",position);
                startActivity(WorldsEnterpreneurZeropositionRef);

            }
        });
    }

}

