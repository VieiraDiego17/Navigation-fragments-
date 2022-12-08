package com.example.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonFirstToSecond).setOnClickListener {
            findNavController().navigate(R.id.actionFirstToSecond)
        }
        view.findViewById<Button>(R.id.buttonFirstToThird).setOnClickListener {
            findNavController().navigate(R.id.actionFirstToThird)
        }
        view.findViewById<Button>(R.id.buttonFirstToFourth).setOnClickListener {
            findNavController().navigate(R.id.actionFirstToFourth)
        }
        view.findViewById<Button>(R.id.buttonFirstToFifth).setOnClickListener {
            findNavController().navigate(R.id.actionFirstToFifth)
        }


    }
}