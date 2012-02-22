package com.batti.homedash;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HomeDashActivity extends Activity {
	
	WebView mCalendarWebView;
	WebView mWeatherWebView;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //Get google account info for calendar / docs
        //AccountManager am = AccountManager.get(this); // "this" references the current Context
        //Account[] accounts = am.getAccountsByType("com.google");

      /*  mCalendarWebView = (WebView) findViewById(R.id.CalendarWebView);
        mCalendarWebView.getSettings().setJavaScriptEnabled(true);
        mCalendarWebView.loadUrl("http://www.blipfoto.com/BattisFamily");
        mCalendarWebView.setWebViewClient(new HomeDashWebViewClient());
        
        mWeatherWebView = (WebView) findViewById(R.id.WeatherWebView);
        mWeatherWebView.getSettings().setJavaScriptEnabled(true);
        mWeatherWebView.loadUrl("http://picasaweb.google.com/seanbattis");
        mWeatherWebView.setWebViewClient(new HomeDashWebViewClient());*/
    }
    //todo: tricky having 2 webviews -Can't handle back for both at once, need to 
    //have them go fullscreen, then go back...
/*    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
            mWebView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
  */  
    private class HomeDashWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}