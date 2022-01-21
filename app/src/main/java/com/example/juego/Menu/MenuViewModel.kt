package com.example.juego.Menu

import android.content.Intent
import android.provider.Settings
import android.view.View
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.example.juego.R

class MenuViewModel : ViewModel() {

    fun juego(view: View){
        view.findNavController().navigate(R.id.juego)
    }
    fun settings(view: View){
       view.findNavController().navigate(R.id.settingsActivity2)
    }
}