@file:Suppress("DEPRECATION")

package com.example.webview.ui.kemiskinan
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

class KemiskinanFragment : Fragment() {

    //private lateinit var kemiskinanViewModel: KemiskinanViewModel
    var webViewPrivacyPolicy: WebView?=null

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
//        kemiskinanViewModel =
//            ViewModelProviders.of(this).get(kemiskinanViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_kemiskinan, container, false)
        //val textView: TextView = root.findViewById(R.id.text_kemiskinan)
//        kemiskinanViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }


}