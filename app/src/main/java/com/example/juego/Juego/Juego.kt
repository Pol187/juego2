package com.example.juego.Juego

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.juego.R
import com.example.juego.databinding.JuegoFragmentBinding

class Juego : Fragment() {

    private lateinit var viewModel: JuegoViewModel
    private lateinit var binding: JuegoFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate<JuegoFragmentBinding>(inflater, R.layout.juego_fragment,container,false)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(this).get(JuegoViewModel::class.java)

        val palabra:String=viewModel.Cargar_palabras(binding.textView5)
      binding.button.setOnClickListener{
          Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show()
            viewModel.adivina(binding.textoAdivina, palabra,binding.textView5)
        }

    }

}