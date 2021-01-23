@file:Suppress("DEPRECATION")

package com.example.webview.ui.perekonomian

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

class PerekonomianFragment : Fragment() {
    var webViewPrivacyPolicy: WebView?=null
    //lateinit var PerekonomianViewModel: PerekonomianViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        PerekonomianViewModel =
//                ViewModelProviders.of(this).get(PerekonomianViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_perekonomian, container, false)
        //val textView: TextView = root.findViewById(R.id.text_perekonimian)
//        PerekonomianViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

}