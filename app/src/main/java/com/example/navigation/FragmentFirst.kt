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

        sendInfo(view)

    }

    fun sendInfo(view: View) {
        val info = view?.findViewById<EditText>(R.id.numeroDigitado)
        val infoToInt = info?.text.toString().toInt()

        view.findViewById<Button>(R.id.buttonFirstToSecond).setOnClickListener {
            val direction = FragmentFirstDirections.actionFirstToSecond(number = infoToInt)
            findNavController().navigate(direction)
        }

//        view.findViewById<Button>(R.id.buttonEnviarInfo).setOnClickListener {
//            val direction = FragmentFirstDirections.actionFirstToSecond()
//            direction.number = infoToInt
//            findNavController().navigate(direction)
//        }
    }

    fun navigation(view: View) {
//        view.findViewById<Button>(R.id.buttonFirstToSecond).setOnClickListener {
//            findNavController().navigate(R.id.actionFirstToSecond)
//        }
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