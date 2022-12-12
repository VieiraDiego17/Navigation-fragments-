package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FragmentThird : Fragment(R.layout.fragment_third) {
    private val args: FragmentThirdArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigation(view)

        view.findViewById<TextView>(R.id.textMensagem).text = "${args.numberThird}"
    }
        fun navigation(view: View){
        view.findViewById<Button>(R.id.buttonThirdToFirst).setOnClickListener {
            findNavController().navigate(R.id.actionThirdToFirst)
        }
        view.findViewById<Button>(R.id.buttonThirdToSecond).setOnClickListener {
            findNavController().navigate(R.id.actionThirdToSecond)
        }
        view.findViewById<Button>(R.id.buttonThirdToFourth).setOnClickListener {
            findNavController().navigate(R.id.actionThirdToFourth)
        }
        view.findViewById<Button>(R.id.buttonThirdToFifth).setOnClickListener {
            findNavController().navigate(R.id.actionThirdToFifth)
        }
    }
}