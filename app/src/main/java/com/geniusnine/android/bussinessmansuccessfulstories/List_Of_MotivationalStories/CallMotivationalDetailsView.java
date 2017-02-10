package com.geniusnine.android.bussinessmansuccessfulstories.List_Of_MotivationalStories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures.CallNineteenthcenturyDetailview;
import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallMotivationalDetailsView extends AppCompatActivity {

    WebView MotivationalWebView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_motivational_details_view);

        MotivationalWebView=(WebView)findViewById(R.id.MotivationalWebView);

        WebSettings webSetting = MotivationalWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        MotivationalWebView.setWebViewClient(new CallMotivationalDetailsView.WebViewClient());

        int position=getIntent().getIntExtra("key",0);

        if(position==0){
            MotivationalWebView.loadUrl("file:///android_res/raw/diru.html");
        }
        else if(position==1){
            MotivationalWebView.loadUrl("file:///android_res/raw/jyothi.html");
        }
        else if(position==2){
            MotivationalWebView.loadUrl("file:///android_res/raw/kailash.html");
        }
        else if(position==3){
            MotivationalWebView.loadUrl("file:///android_res/raw/karsanbai.html");
        }
        else if(position==4){
            MotivationalWebView.loadUrl("file:///android_res/raw/mustafa.html");

        }else if(position==5){
            MotivationalWebView.loadUrl("file:///android_res/raw/nitin.html");
        }else if(position==6){
            MotivationalWebView.loadUrl("file:///android_res/raw/patricia.html");
        }else if(position==7){
            MotivationalWebView.loadUrl("file:///android_res/raw/premganapati.html");
        }else if(position==8){
            MotivationalWebView.loadUrl("file:///android_res/raw/ramesh.html");
        }else if(position==9){
            MotivationalWebView.loadUrl("file:///android_res/raw/sridhar.html");
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
