package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class FragmentSecond : Fragment(R.layout.fragment_second) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



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

//        val args: FragmentSecondArgs by navArgs()
//
//        val mensagemRecebida = view.findViewById<TextView>(R.id.textMensagem)
//        val number = args.number
//        //mensagemRecebida.text = number.toString()
//        mensagemRecebida.text = "${args.number}"
    }
    }
