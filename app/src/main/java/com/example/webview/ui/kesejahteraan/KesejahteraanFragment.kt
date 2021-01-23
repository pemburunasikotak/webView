@file:Suppress("DEPRECATION")

package com.example.webview.ui.kesejahteraan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.webview.R

class KesejahteraanFragment : Fragment() {
    var webViewPrivacyPolicy: WebView?=null
    // lateinit var KesejahteraanViewModel: KesejahteraanViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        KesejahteraanViewModel =
//                ViewModelProviders.of(this).get(KesejahteraanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_kesejahteraan, container, false)
        //val textView: TextView = root.findViewById(R.id.text_kesejahteraan)
//        KesejahteraanViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

}