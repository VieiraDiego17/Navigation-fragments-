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

class FragmentFifth : Fragment(R.layout.fragment_fifth) {
    private val args: FragmentFifthArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fifthToFirst(view)
        fifthToSecond(view)
        fifthToThird(view)
        fifthToFourth(view)

        view?.findViewById<TextView>(R.id.textMensagem)?.text = "${args.numberFifth}"
    }

    fun fifthToFirst(view: View) {
        view?.findViewById<Button>(R.id.buttonFifthToFirst)?.setOnClickListener {
            findNavController().navigate(R.id.actionFifthToFirst)
        }
    }
    fun fifthToSecond(view: View) {
        view?.findViewById<Button>(R.id.buttonFifthToSecond)?.setOnClickListener {
            findNavController().navigate(R.id.actionFifthToSecond)
        }
    }
    fun fifthToThird(view: View) {
        view?.findViewById<Button>(R.id.buttonFifthToThird)?.setOnClickListener {
            findNavController().navigate(R.id.actionFifthToThird)
        }
    }
    fun fifthToFourth(view: View) {
        view?.findViewById<Button>(R.id.buttonFifthToFourth)?.setOnClickListener {
            findNavController().navigate(R.id.actionFifthToFourth)
        }
    }
}