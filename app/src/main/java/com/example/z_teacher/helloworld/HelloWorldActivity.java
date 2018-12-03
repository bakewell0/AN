package com.example.z_teacher.helloworld;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class HelloWorldActivity extends AppCompatActivity {
    private Button btn1;

    @android.webkit.JavascriptInterface
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Toast.makeText(this,"成功",Toast.LENGTH_SHORT).show();
        btn1 = (Button) findViewById(R.id.bt2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"罗创，我爱你",Toast.LENGTH_SHORT).show();
            }
        });

        ///////////
        WebView webView = (WebView)findViewById(R.id.wv_webview);
        String url = "https://www.baidu.com/";
        //此方法可以在webview中打开链接而不会跳转到外部浏览器
        webView.setWebViewClient(new WebViewClient());
        //此方法可以启用html5页面的javascript
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.loadUrl(url);
        webView.loadUrl("file:///android_asset/test.html");
        webView.addJavascriptInterface(99, "wx");
    }
}
