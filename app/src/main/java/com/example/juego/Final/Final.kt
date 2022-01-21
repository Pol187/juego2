package com.example.juego.Final


import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.juego.Juego.Juego
import com.example.juego.R

import com.example.juego.databinding.FinalFragmentBinding
import com.example.juego.databinding.JuegoFragmentBinding


class Final : Fragment() {

    private lateinit var viewModel: FinalViewModel
    private lateinit var binding: FinalFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FinalFragmentBinding.inflate(inflater)

        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(this).get(FinalViewModel::class.java)

        val tv = view.findViewById<TextView>(R.id.button_final)
        tv.text = arguments?.getString("final")



    }

}