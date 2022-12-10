package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class FragmentSecond : Fragment(R.layout.fragment_second) {

    val argumentos: FragmentSecondArgs by navArgs()
    //val argumentos by navArgs<FragmentSecondArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navigation(view)

        val info = argumentos.number
        //val infoReceived = view.findViewById<TextView>(R.id.textMensagem).setText(info)
        val infoReceived = view.findViewById<TextView>(R.id.textMensagem)
        //infoReceived.text = info.toString()
        infoReceived.text = "${info}"
//        val mensagemRecebida = view.findViewById<TextView>(R.id.textMensagem)
//        val number = args.number
//        //mensagemRecebida.text = number.toString()
//        mensagemRecebida.text = "${args.number}"
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
