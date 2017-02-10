package com.geniusnine.android.bussinessmansuccessfulstories.WorldsTopBusinessEnterpreneur;
//calling worlds enterpreneur webview
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallWorldsEnterpreneurDetailsView extends AppCompatActivity {
    WebView WorldsEnterpreneurWebView;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_worlds_enterpreneur_details_view);

        WorldsEnterpreneurWebView=(WebView)findViewById(R.id.CallWorldsEnterpreneurWebViwId);

        WebSettings webSetting = WorldsEnterpreneurWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        WorldsEnterpreneurWebView.setWebViewClient(new CallWorldsEnterpreneurDetailsView.WebViewClient());

        int position=getIntent().getIntExtra("key",0);

        if(position==0){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/car.html");
        }
        else if(position==1){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/war.html");
        }
        else if(position==2){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/aman.html");
        }
        else if(position==3){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/larryy.html");
        }
        else if(position==4){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/kochh.html");

        }else if(position==5){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/bran.html");
        }else if(position==6){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/shel.html");
        }else if(position==7){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/wal.html");
        }else if(position==8){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/ama.html");
        }else if(position==9){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/lili.html");
        }
        else if(position==10){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/woz.html");
        }else if(position==11){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/li.html");
        }else if(position==12){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/mi.html");
        }else if(position==13){
            WorldsEnterpreneurWebView.loadUrl("file:///android_res/raw/dell.html");
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
