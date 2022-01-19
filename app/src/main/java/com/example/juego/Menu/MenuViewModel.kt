package com.example.juego.Menu

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.juego.R

class MenuViewModel : ViewModel() {

    fun juego(view: View){
        view.findNavController().navigate(R.id.juego)

    }
}