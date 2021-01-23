@file:Suppress("DEPRECATION")

package com.example.webview.ui.ketenagakerjaan

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

class KetenagakerjaanFragment : Fragment() {
    var webViewPrivacyPolicy: WebView?=null
    // lateinit var KetenagakerjaanViewModel: KetenagakerjaanViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        KetenagakerjaanViewModel =
//                ViewModelProviders.of(this).get(KetenagakerjaanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_ketenagakerjaan, container, false)
        //val textView: TextView = root.findViewById(R.id.text_ketenagakerjaan)
//        KetenagakerjaanViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

}