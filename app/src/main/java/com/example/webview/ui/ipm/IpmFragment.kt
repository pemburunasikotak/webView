@file:Suppress("DEPRECATION")

package com.example.webview.ui.ipm

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

class IpmFragment : Fragment() {

    lateinit var IpmViewModel: IpmViewModel
    var webViewPrivacyPolicy:WebView?=null
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.fragment_ipm, container, false)
       // val textView: TextView = root.findViewById(R.id.text_ipm)

        return root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        webViewPrivacyPolicy = view.findViewById(R.id.webViewIpm) as WebView
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
        webViewPrivacyPolicy!!.loadUrl("https://stackoverflow.com/questions/50312777/java-lang-nullpointerexception-android-attempt-to-invoke-virtual-method-error")
        /* set webview client */
        webViewPrivacyPolicy!!.webViewClient = WebViewClient()
        //webViewPrivacyPolicy!!.loadUrl("https://salatigakota.bps.go.id/subject/40/gender.html#subjekViewTab3")


    }
}