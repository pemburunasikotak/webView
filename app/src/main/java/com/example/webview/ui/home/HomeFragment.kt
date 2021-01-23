@file:Suppress("DEPRECATION")

package com.example.webview.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.webview.R


class HomeFragment : Fragment() {
    var mWebView: WebView? = null
    var webViewPrivacyPolicy:WebView?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        webViewPrivacyPolicy = view.findViewById(R.id.webView) as WebView
        /* get setting from webview to set load image automatically to true */
        webViewPrivacyPolicy!!.settings.loadsImagesAutomatically = true
        /* get setting from webview to set java script enable */
        webViewPrivacyPolicy!!.settings.javaScriptEnabled = true
        /* get setting from webview to set dom storage enable */
        webViewPrivacyPolicy!!.settings.domStorageEnabled = true
        /* get setting from webview to set support for zoom to true */
        webViewPrivacyPolicy!!.settings.setSupportZoom(false)
        /* get setting from webview to set built in zoom controls to true */
        webViewPrivacyPolicy!!.settings.builtInZoomControls = false
        /* get setting from webview to set display zom control to false*/
        webViewPrivacyPolicy!!.settings.displayZoomControls = false
        webViewPrivacyPolicy!!.settings.defaultZoom = WebSettings.ZoomDensity.FAR
        /* set scrollbar style to SCROLLBARS_INSIDE_OVERLAY */
        webViewPrivacyPolicy!!.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY

        /* set webview client */
        webViewPrivacyPolicy!!.webViewClient = WebViewClient()
        webViewPrivacyPolicy!!.loadUrl("https://bps.go.id/")
    }
}

