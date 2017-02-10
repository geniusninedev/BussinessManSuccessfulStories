package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;
//callin 18th cen web view
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallEighteenthCenturyFiles extends AppCompatActivity {
WebView eighteenth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_eighteenth_century_files2);

        eighteenth=(WebView)findViewById(R.id.DisplayFiles);

        WebSettings webSetting = eighteenth.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        eighteenth.setWebViewClient(new CallEighteenthCenturyFiles.WebViewClient());

        int position=getIntent().getIntExtra("key",0);

        if(position==0){
            eighteenth.loadUrl("file:///android_res/raw/anna.html");
        }
        else if(position==1){
            eighteenth.loadUrl("file:///android_res/raw/james.html");
        }
        else if(position==2){
            eighteenth.loadUrl("file:///android_res/raw/sam.html");
        }
        else if(position==3){
            eighteenth.loadUrl("file:///android_res/raw/thomas.html");
        }
        else if(position==4){
            eighteenth.loadUrl("file:///android_res/raw/claus.html");

        }else if(position==5){
            eighteenth.loadUrl("file:///android_res/raw/john.html");
        }
    }
    class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }

}



