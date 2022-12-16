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

class FragmentFourth : Fragment(R.layout.fragment_fourth) {
    private val args: FragmentFourthArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fourthToFirst(view)
        fourthToSecond(view)
        fourthToThird(view)
        fourthToFifth(view)

        view?.findViewById<TextView>(R.id.textMensagem)?.text = "${args.numberFourth}"
    }

    fun fourthToFirst(view: View) {
        view?.findViewById<Button>(R.id.buttonFourthToFirst)?.setOnClickListener {
            findNavController().navigate(R.id.actionFourthToFirst)
        }
    }

    fun fourthToSecond(view: View) {
        view?.findViewById<Button>(R.id.buttonFourthToSecond)?.setOnClickListener {
            findNavController().navigate(R.id.actionFourthToSecond)
        }
    }

    fun fourthToThird(view: View) {
        view?.findViewById<Button>(R.id.buttonFourthToThird)?.setOnClickListener {
            findNavController().navigate(R.id.actionFourthTothird)
        }
    }

    fun fourthToFifth(view: View) {
        view?.findViewById<Button>(R.id.buttonFourthToFifth)?.setOnClickListener {
            findNavController().navigate(R.id.actionFourthToFifth)
        }
    }
}