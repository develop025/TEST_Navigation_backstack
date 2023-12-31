package com.example.android.navigationadvancedsample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class ExampleFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_example, container, false)

        val userName = arguments?.getString("userName")
        Log.d("Example", "userName: $userName")
        view.findViewById<TextView>(R.id.tvName).text = userName
        view.findViewById<Button>(R.id.btnProceed).setOnClickListener {
            findNavController().navigate(R.id.action_exampleFragment_to_userProfile, arguments)
        }

        return view
    }
}