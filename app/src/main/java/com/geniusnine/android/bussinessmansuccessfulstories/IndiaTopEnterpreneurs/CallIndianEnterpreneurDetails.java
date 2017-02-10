package com.geniusnine.android.bussinessmansuccessfulstories.IndiaTopEnterpreneurs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.List_Of_MotivationalStories.CallMotivationalDetailsView;
import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallIndianEnterpreneurDetails extends AppCompatActivity {

    WebView IndiaEnterpreneurWebView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_indian_enterpreneur_details);

        IndiaEnterpreneurWebView=(WebView)findViewById(R.id.CallIndiaEnterpreneurWebViwId);

        WebSettings webSetting = IndiaEnterpreneurWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        IndiaEnterpreneurWebView.setWebViewClient(new CallIndianEnterpreneurDetails.WebViewClient());

        int position=getIntent().getIntExtra("key",0);

        if(position==0){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/ach.html");
        }
        else if(position==1){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/aj.html");
        }
        else if(position==2){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/an.html");
        }
        else if(position==3){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/anil.html");
        }
        else if(position==4){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/as.html");

        }else if(position==5){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/azim.html");
        }else if(position==6){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/baba.html");
        }else if(position==7){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/brij.html");
        }else if(position==8){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/chii.html");
        }else if(position==9){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/cyr.html");
        }else if(position==10){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/dil.html");
        }else if(position==11){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/fai.html");
        }else if(position==12){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/gopi.html");
        }else if(position==13){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/thap.html");
        }/*else if(position==14){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/girishmathru.html");
        }else if(position==15){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/grandhi.html");
        }else if(position==16){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/gunupathi.html");
        }else if(position==17){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/jagdish.html");
        }else if(position==18){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/kalanithii.html");
        }else if(position==19){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/kallam.html");
        }else if(position==20){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/karsanbhai.html");
        }else if(position==21){
            IndiaEnterpreneurWebView.loadUrl("file:///android_res/raw/kartikeya.html");*/




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
