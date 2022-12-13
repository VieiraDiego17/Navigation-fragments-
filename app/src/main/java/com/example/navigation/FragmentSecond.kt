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
        view.findViewById<Button>(R.id.buttonSecondToFirst).setOnClickListener {
            findNavController().navigate(R.id.actionSecondToFirst)
        }

        view.findViewById<Button>(R.id.buttonSecondToThird).setOnClickListener {
            findNavController().navigate(R.id.actionSecondToThird)
        }

        view.findViewById<Button>(R.id.buttonSecondToFourth).setOnClickListener {
            findNavController().navigate(R.id.actionSecondToFourth)
        }

        view.findViewById<Button>(R.id.buttonSecondToFifth).setOnClickListener {
            findNavController().navigate(R.id.actionSecondToFifth)
        }
    }
    }

