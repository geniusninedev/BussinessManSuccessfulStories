package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;
//calling list of twenty century businessman names
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

public class CallTwentyCenturydetails extends AppCompatActivity {
ListView CallTwentyCenturyListView;
    ArrayAdapter<String> adapter;
    String[] ListOfTwentycentury={"Anita Roddick ","Bill Gates","Carlos Slim","Coco Chanel","Dean Kamen",
            "Dhirubhai Ambani","Donald Trump","Enzo Ferrari "," Estée Lauder"," Henry Ford ","Henry Hu","Howard Hughes",
            "Ingvar Kamprad","J.R.D. Tata","Kiran Mazumdar-Shaw ","Larry Ellison","Madam C.J. Walker ",
            "Mary Kay Ash","Michael Dell ","Magnús Scheving","N. R. Narayana Murthy ","Oprah Winfrey",
            "Sir Richard Branson","Steve Jobs","Ted Turner","Sam M. Walton","Sir Terry Matthews ","Vijay Mallya","Vinod Khosla","Vince McMahon"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_twenty_centurydetails);
        CallTwentyCenturyListView=(ListView)findViewById(R.id.ListOfTwentyCentury);
        adapter=new ArrayAdapter<String>(getApplicationContext(),R.layout.activity_call_twenty_centurydetails,R.id.TwentycenturytextView,ListOfTwentycentury);
        CallTwentyCenturyListView.setAdapter(adapter);
        CallTwentyCenturyListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent CallTwentyCenturyPositionref=new Intent(CallTwentyCenturydetails.this,CallTwentyCenturydetailsView.class);
                 CallTwentyCenturyPositionref.putExtra("key",position);
                startActivity(CallTwentyCenturyPositionref);
            }
        });
    }


}
