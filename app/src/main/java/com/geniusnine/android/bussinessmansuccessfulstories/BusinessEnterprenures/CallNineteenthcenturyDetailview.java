package com.geniusnine.android.bussinessmansuccessfulstories.BusinessEnterprenures;
//displaying nineteenthcentury htmls
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.geniusnine.android.bussinessmansuccessfulstories.R;

public class CallNineteenthcenturyDetailview extends AppCompatActivity {

    WebView NineteenthCenturyWebview;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_eighteenth_century_files);

        NineteenthCenturyWebview=(WebView)findViewById(R.id.DisplayFiles);

        WebSettings webSetting = NineteenthCenturyWebview.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        NineteenthCenturyWebview.setWebViewClient(new CallNineteenthcenturyDetailview.WebViewClient());

        int position=getIntent().getIntExtra("key",0);

        if(position==0){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/nineteenthpos0.html");
        }
        else if(position==1){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/bidd.html");
        }
        else if(position==2){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/cha.html");
        }
        else if(position==3){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/corn.html");
        }
        else if(position==4){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/eug.html");

        }else if(position==5){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/jacob.html");
        }else if(position==6){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/joseph.html");
        }else if(position==7){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/jamess.html");
        }else if(position==8){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/jp.html");
        }else if(position==9){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/tata.html");
        }
        else if(position==10){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/rock.html");
        }else if(position==11){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/land.html");
        }else if(position==12){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/nik.html");
        }else if(position==13){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/rich.html");
        }else if(position==14){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/edi.html");
        }else if(position==15){
            NineteenthCenturyWebview.loadUrl("file:///android_res/raw/levi.html");
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
