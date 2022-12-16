package com.example.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FragmentFirst : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val info = view?.findViewById<EditText>(R.id.numeroDigitado)

        firstToSecond(view, info)
        firstToThird(view, info)
        firstToFourth(view, info)
        firstToFifth(view, info)
    }

    fun firstToSecond(view: View, info: EditText?) {
        view?.findViewById<Button>(R.id.buttonFirstToSecond)?.setOnClickListener {
            val action = FragmentFirstDirections.actionFirstToSecond(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }
    }

    fun firstToThird(view: View, info: EditText?) {
        view?.findViewById<Button>(R.id.buttonFirstToThird)?.setOnClickListener {
            val action = FragmentFirstDirections.actionFirstToThird(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }
    }

    fun firstToFourth(view: View, info: EditText?) {
        view?.findViewById<Button>(R.id.buttonFirstToFourth)?.setOnClickListener {
            val action = FragmentFirstDirections.actionFirstToFourth(
                info?.text.toString().toInt()
            )
            findNavController().navigate(action)
        }
    }

    fun firstToFifth(view: View, info: EditText?) {
            view?.findViewById<Button>(R.id.buttonFirstToFifth)?.setOnClickListener {
                val action = FragmentFirstDirections.actionFirstToFifth(
                    info?.text.toString().toInt()
                )
                findNavController().navigate(action)
            }
        }
    }





