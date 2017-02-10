package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;
//calling twentycentury htmls
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;
public class CallTwentyCenturydetailsView extends AppCompatActivity {
WebView CallTwentyCenturyWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_twenty_centurydetails_view);
        CallTwentyCenturyWebview=(WebView)findViewById(R.id.CallTwentyCenturyWebViwId);
        WebSettings webSetting = CallTwentyCenturyWebview.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        CallTwentyCenturyWebview.setWebViewClient(new CallTwentyCenturydetailsView.WebViewClient());

        int position=getIntent().getIntExtra("key",0);

        if(position==0){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/ani.html");
        }
        else if(position==1){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/bill.html");
        }
        else if(position==2){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/carlo.html");
        }
        else if(position==3){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/coco.html");
        }
        else if(position==4){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/dean.html");

        }else if(position==5){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/diru.html");
        }else if(position==6){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/dona.html");
        }else if(position==7){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/enzo.html");
        }else if(position==8){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/estee.html");
        }else if(position==9){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/henry.html");
        }
        else if(position==10){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/hu.html");
        }else if(position==11){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/howard.html");
        }else if(position==12){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/ing.html");
        }else if(position==13){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/jr.html");
        }else if(position==14){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/kiran.html");
        }else if(position==15){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/larryy.html");
        }else if(position==16){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/madam.html");
        }else if(position==17){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/maryy.html");
        }else if(position==18){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/dell.html");
        }else if(position==19){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/mag.html");
        }else if(position==20){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/nara.html");
        }else if(position==21){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/op.html");
        }else if(position==22){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/bran.html");
        }else if(position==23){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/steve.html");
        }else if(position==24){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/ted.html");
        }else if(position==25){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/samw.html");
        }else if(position==26){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/terry.html");
        }else if(position==27){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/vijay.html");
        }else if(position==28){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/vinod.html");
        }else if(position==29){
            CallTwentyCenturyWebview.loadUrl("file:///android_res/raw/vince.html");
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

