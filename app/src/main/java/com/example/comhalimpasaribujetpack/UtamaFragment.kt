package com.example.comhalimpasaribujetpack


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController

/**
 * A simple [Fragment] subclass.
 */
class UtamaFragment : Fragment() {
    lateinit var nav : NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_utama, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nav = navigation.findNavController(view)
        buttonEnter.setonClickListener{it:view!
                nav.navigate(R.id.action_utamaFragment_to_inputFragment)

        }
    }

}
