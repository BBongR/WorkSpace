package com.example.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // 위젯 선언 4개
    private WebView webView;
    private Button btnGo;
    private Button btnPrev;
    private EditText edtUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯 찾기 4개
        webView = findViewById(R.id.webView);
        btnGo = findViewById(R.id.btnGo);
        btnPrev = findViewById(R.id.btnPrev);
        edtUrl = findViewById(R.id.edtUrl);

        // 위젯 설정

        // 버튼 설정
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = edtUrl.getText().toString();
                webView.loadUrl(url);
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.goBack();
            }
        });

        // WebView
        // WebViewClient 구현 클래스를 이용한 줌인 기능 추가.
        // WebView.loadUrl() : 사이트열기
        // WebView.goBack() : 뒤로가기
        webView.setWebViewClient(new MyWebClient());
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptEnabled(true);

    }

    private class MyWebClient extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
