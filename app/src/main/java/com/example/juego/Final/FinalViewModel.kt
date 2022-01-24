package com.example.juego.Final

import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.juego.R

class FinalViewModel : ViewModel() {
fun juego(view: View) {
    view.findNavController().navigate(R.id.juego)
    }
}