package com.tech.ssylix.homepage

import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_about_alc.*
import kotlinx.android.synthetic.main.content_about_alc.*

class AboutALC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_alc)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        alc_webview.settings.javaScriptEnabled = true
        alc_webview.webViewClient = WebViewClient()
        alc_webview.loadUrl("https://andela.com/alc/")
    }

}
// https://www.google.com/
// https://andela.com/alc/