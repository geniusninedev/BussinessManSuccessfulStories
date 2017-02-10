package com.geniusnine.android.bussinessmansuccessfulstories.List_Of_MotivationalStories;

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
import com.geniusnine.android.bussinessmansuccessfulstories.WorldsTopBusinessEnterpreneur.CallWorldsEnterpreneurDetailsView;
import com.geniusnine.android.bussinessmansuccessfulstories.WorldsTopBusinessEnterpreneur.List_Of_WorldsEnterpreneur;

public class List_Of_Motivational_Stories extends AppCompatActivity {

    ListView CallMotivationalStoriesList;
    ArrayAdapter<String> adapter;
    String[] ListOfMotivationalStoriesList = {"Dhiru Bhai Ambani", "Jyothi Reddy", "Kailash Katkar", "Karsanbhai Patel",
            "P C Mustafa ", "Nitin Godse", "Patricia Narayan", "Prem Ganapathy ",
            "Ramesh Babu", "Sridhar Vembu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__of__motivational__stories);
        CallMotivationalStoriesList = (ListView) findViewById(R.id.MotivationalStoriesListview);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.activity_list__of__motivational__stories, R.id.MotivationalStoriestextView, ListOfMotivationalStoriesList);
        CallMotivationalStoriesList.setAdapter(adapter);
        CallMotivationalStoriesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent WorldsEnterpreneurZeropositionRef = new Intent(List_Of_Motivational_Stories.this, CallMotivationalDetailsView.class);
                WorldsEnterpreneurZeropositionRef.putExtra("key", position);
                startActivity(WorldsEnterpreneurZeropositionRef);

            }
        });
    }
}
