@file:Suppress("DEPRECATION")

package com.example.webview.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.webview.R


class HomeFragment : Fragment() {
    var mWebView: WebView? = null
   // private lateinit var homeViewModel: HomeViewModel
   var webViewPrivacyPolicy:WebView?=null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_home, container, false)

        //view rootView= inflater.inflate(R.layout.fragment_home,container, false)
        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        

//        webViewPrivacyPolicy = view.findViewById(R.id.webView) as WebView
//        /* get setting from webview to set load image automatically to true */
//        webViewPrivacyPolicy!!.settings.loadsImagesAutomatically = true
//        /* get setting from webview to set java script enable */
//        webViewPrivacyPolicy!!.settings.javaScriptEnabled = true
//        /* get setting from webview to set dom storage enable */
//        webViewPrivacyPolicy!!.settings.domStorageEnabled = true
//        /* get setting from webview to set support for zoom to true */
//        webViewPrivacyPolicy!!.settings.setSupportZoom(false)
//        /* get setting from webview to set built in zoom controls to true */
//        webViewPrivacyPolicy!!.settings.builtInZoomControls = false
//        /* get setting from webview to set display zom control to false*/
//        webViewPrivacyPolicy!!.settings.displayZoomControls = false
//        webViewPrivacyPolicy!!.settings.defaultZoom = WebSettings.ZoomDensity.FAR
//        /* set scrollbar style to SCROLLBARS_INSIDE_OVERLAY */
//        webViewPrivacyPolicy!!.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
//        webViewPrivacyPolicy!!.loadUrl("https://salatigakota.bps.go.id")
//        /* set webview client */
//        webViewPrivacyPolicy!!.webViewClient = WebViewClient()
//
//        //webViewPrivacyPolicy!!.loadUrl("https://salatigakota.bps.go.id/subject/40/gender.html#subjekViewTab3")
//


    }

    //        wmWebView = view.findViewById(R.id.webView) as WebVie
//        mWebView!!.loadUrl("https://salatigakota.bps.go.id/subject/40/gender.html#subjekViewTab3")
//
//        val webSettings = mWebView!!.getSettings()
//        webSettings.setJavaScriptEnabled(true)
//
//// Force links and redirects to open in the WebView instead of in a browser
//        mWebView!!.setWebViewClient(WebViewClient())





}

