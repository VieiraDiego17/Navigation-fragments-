package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class FragmentSecond : Fragment(R.layout.fragment_second) {

    private val args: FragmentSecondArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigation(view)

        view.findViewById<TextView>(R.id.textMensagem).text = "${args.numberSecond}"
    }

    fun navigation(view: View){

        val info = view?.findViewById<EditText>(R.id.numeroDigitado)

        view.findViewById<Button>(R.id.buttonSecondToFirst).setOnClickListener {
            val action = FragmentSecondDirections.actionSecondToFirst(
                info?.text.toString().toInt()            )
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.buttonSecondToThird).setOnClickListener {
            val action = FragmentSecondDirections.actionSecondToThird(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.buttonSecondToFourth).setOnClickListener {
            val action = FragmentSecondDirections.actionSecondToFourth(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.buttonSecondToFifth).setOnClickListener {
            val action = FragmentSecondDirections.actionSecondToFifth(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }
    }
    }

