package id.mutqin.hafalan;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;

public class MainActivity extends Activity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(android.graphics.Color.rgb(6,78,59));
        getWindow().setNavigationBarColor(android.graphics.Color.rgb(5,46,36));
        WebView web = new WebView(this);
        web.setBackgroundColor(android.graphics.Color.rgb(247,248,244));
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setAllowFileAccess(true);
        web.setWebViewClient(new WebViewClient());
        web.setWebChromeClient(new WebChromeClient());
        setContentView(web);
        web.loadUrl("file:///android_asset/index.html");
    }
    @Override public void onBackPressed() { super.onBackPressed(); }
}
