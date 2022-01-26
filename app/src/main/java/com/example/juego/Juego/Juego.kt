package com.example.juego.Juego

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.juego.databinding.JuegoFragmentBinding
import androidx.preference.PreferenceManager
class Juego : Fragment() {

    private lateinit var viewModel: JuegoViewModel
    private lateinit var binding: JuegoFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= JuegoFragmentBinding.inflate(inflater)
        return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel=ViewModelProvider(this).get(JuegoViewModel::class.java)
        val pref = PreferenceManager.getDefaultSharedPreferences(context)
        val numero: String? = pref.getString("level","")
        var intentos:String=numero.toString()
        binding.textViewIntentos.setText(intentos)
        val palabra:String=viewModel.Cargar_palabras(binding.textView5)
        binding.button.setOnClickListener{
          Toast.makeText(requireContext(), "", Toast.LENGTH_SHORT).show()
            viewModel.adivina(binding.textoAdivina, palabra,binding.textView5,binding.textViewIntentos,view)
            }
        binding.buttonSettings.setOnClickListener{
            viewModel.settings(view)
        }

    }
}