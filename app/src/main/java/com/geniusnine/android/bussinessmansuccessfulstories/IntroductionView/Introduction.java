package com.geniusnine.android.bussinessmansuccessfulstories.IntroductionView;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.Quotes.QuotesList;
import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class Introduction extends AppCompatActivity {

    WebView Introductionweb;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Introductionweb = (WebView) findViewById(R.id.IntroductionWebView);

        WebSettings webSetting = Introductionweb.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        Introductionweb.setWebViewClient(new Introduction.WebViewClient());
        Introductionweb.loadUrl("file:///android_res/raw/intro.html");
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
