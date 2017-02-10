package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallTwentyFirstCenturydetailsView extends AppCompatActivity {

    WebView CallTwentyFirstCenturyWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_twenty_first_centurydetails_view);
        CallTwentyFirstCenturyWebview = (WebView) findViewById(R.id.CallTwentyFirstCenturyWebViwId);
        WebSettings webSetting = CallTwentyFirstCenturyWebview.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        CallTwentyFirstCenturyWebview.setWebViewClient(new CallTwentyFirstCenturydetailsView.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/brian.html");
        } else if (position == 1) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/akre.html");
        } else if (position == 2) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/rod.html");
        } else if (position == 3) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/qais.html");
        } else if (position == 4) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/pierre.html");

        } else if (position == 5) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/bax.html");
        } else if (position == 6) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/joe.html");
        } else if (position == 7) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/ryan.html");
        } else if (position == 8) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/sara.html");
        } else if (position == 9) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/brin.html");
        } else if (position == 10) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/mal.html");
        } else if (position == 11) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/nanncy.html");
        } else if (position == 12) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/cuban.html");
        } else if (position == 13) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/nick.html");
        } else if (position == 14) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/dor.html");
        } else if (position == 15) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/sha.html");
        } else if (position == 16) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/vis.html");
        } else if (position == 17) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/reid.html");
        } else if (position == 18) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/drew.html");
        } else if (position == 19) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/jess.html");
        } else if (position == 20) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/elle.html");
        } else if (position == 21) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/david.html");
        } else if (position == 22) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/sal.html");
        } else if (position == 23) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/jan.html");
        } else if (position == 24) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/jeremy.html");
        } else if (position == 25) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/mai.html");
        } else if (position == 26) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/fadi.html");
        } else if (position == 27) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/strive.html");
        } else if (position == 28) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/dave.html");
        } else if (position == 29) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/elon.html");
        } else if (position == 30) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/alexis.html");
        } /*else if (position == 31) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/elon.html");
        } else if (position == 32) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/alexis.html");
        } else if (position == 33) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/larry.html");
        } else if (position == 34) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/sean.html");
        } else if (position == 35) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/stefano.html");
        } else if (position == 36) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/michelle.html");
        } else if (position == 33) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/bhargav.html");
        } else if (position == 34) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/kelsey.html");
        } else if (position == 35) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/charlesresler.html");
        } else if (position == 36) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/burton.html");
        } else if (position == 37) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/kevinrose.html");
        } else if (position == 38) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/karthikeya.html");
        } else if (position == 39) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/hans.html");
        } else if (position == 40) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/lane.html");
        } else if (position == 41) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/kevinsystrom.html");
        } else if (position == 42) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/wu.html");
        } else if (position == 43) {
            CallTwentyFirstCenturyWebview.loadUrl("file:///android_res/raw/markzukerberg.html");*/

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

