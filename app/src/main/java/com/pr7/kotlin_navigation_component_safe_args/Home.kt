package com.pr7.kotlin_navigation_component_safe_args

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController


class Home : Fragment() {
   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view=inflater.inflate(R.layout.fragment_home, container, false)
       val textview: TextView =view.findViewById(R.id.textview1)
       textview.setOnClickListener {
           val action=HomeDirections.actionHomeToDetails(10)
           findNavController().navigate(action)
       }
       return view
    }


}