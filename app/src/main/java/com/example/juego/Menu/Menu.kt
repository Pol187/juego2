package com.example.juego.Menu

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.juego.Juego.JuegoViewModel
import com.example.juego.R
import com.example.juego.databinding.JuegoFragmentBinding
import com.example.juego.databinding.MenuFragmentBinding

class Menu : Fragment() {



    private lateinit var viewModel: MenuViewModel
    private lateinit var binding: MenuFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate<MenuFragmentBinding>(inflater, R.layout.menu_fragment,container,false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(this).get(MenuViewModel::class.java)

        binding.buttonStart.setOnClickListener {
            viewModel.juego(view)
        }

    }

}