package com.example.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class FragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigation(view)

    }

    fun navigation(view: View) {
        val info = view?.findViewById<EditText>(R.id.numeroDigitado)

        view?.findViewById<Button>(R.id.buttonFirstToSecond)?.setOnClickListener{
            val action = FragmentFirstDirections.actionFirstToSecond(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.buttonFirstToThird).setOnClickListener {
            val action = FragmentFirstDirections.actionFirstToThird(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.buttonFirstToFourth).setOnClickListener {
            val action = FragmentFirstDirections.actionFirstToFourth(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)        }
        view.findViewById<Button>(R.id.buttonFirstToFifth).setOnClickListener {
            val action = FragmentFirstDirections.actionFirstToFifth(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }
    }
}



