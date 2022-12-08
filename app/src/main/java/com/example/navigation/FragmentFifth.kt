package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class FragmentFifth : Fragment(R.layout.fragment_fifth) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.buttonFifthToFirst).setOnClickListener {
            findNavController().navigate(R.id.actionFifthToFirst)
        }
        view.findViewById<Button>(R.id.buttonFifthToSecond).setOnClickListener {
            findNavController().navigate(R.id.actionFifthToSecond)
        }
        view.findViewById<Button>(R.id.buttonFifthToThird).setOnClickListener {
            findNavController().navigate(R.id.actionFifthToThird)
        }
        view.findViewById<Button>(R.id.buttonFifthToFourth).setOnClickListener {
            findNavController().navigate(R.id.actionFifthToFourth)
        }
    }
}