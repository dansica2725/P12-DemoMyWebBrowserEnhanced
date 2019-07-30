package c346.rp.edu.sg.demomywebbrowserenhanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

import c346.rp.edu.sg.mywebbrowserenhanced.R;

public class MainActivity extends AppCompatActivity {

    Button loadBtn;
    WebView webView;
    EditText urlEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadBtn = findViewById(R.id.loadBtn);
        webView = findViewById(R.id.webView);
        urlEt = findViewById(R.id.urlEt);

        webView.setWebViewClient(new WebViewClient());

        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = urlEt.getText().toString();

                webView.loadUrl(url);
                webView.getSettings().setBuiltInZoomControls(true);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setAllowFileAccess(false);
            }
        });

    }
}
