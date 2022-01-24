package com.example.juego.Juego

import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.juego.R

import java.util.*



class JuegoViewModel : ViewModel() {
    fun settings(view: View){
        view.findNavController().navigate(R.id.settingsActivity2)
    }
//https://wordsapiv1.p.mashape.com/words/example
    private lateinit var palabras: MutableList<String>
    fun Cargar_palabras(texto_adivina: TextView): String {
        palabras = mutableListOf(
            "minar",
            /*"chismoso",
            "inhalar",
            "linda",
            "monja",
            "ingles",
            "pequeño",
            "catedral",
            "cochera",
            "pierna"*/
        )
        Collections.shuffle(palabras)
        val random: String = palabras.get(0)
        var random_escondida = ""
        var i: Int = 0

        while (i < random.length) {
            random_escondida += "?"
            i++
        }
        texto_adivina.setText(random_escondida)
        return random
    }

     fun adivina(letra: EditText, palabra: String, textView5: TextView, textViewIntentos: TextView, view: View){

        var letra= letra.text.toString()
        var intento=textViewIntentos.text.toString().toInt()
        var oldString=textView5.text.toString()
        var index = 0
        var verif=false

        while (index <palabra.length) {
            if (palabra[index].toString() == letra) {
                oldString= StringBuilder(oldString).replace(index,index+1, letra).toString()
                verif=true
            }
            index++
        }

        if(!verif){
            intento--
        }

    comprovar(intento, view, textView5, textViewIntentos, palabra, oldString)
    }
    fun comprovar(intento: Int, view: View, textView5: TextView,
                  textViewIntentos: TextView, palabra: String,
                  oldString: String) {

       var nombre =""
        if(intento==0){
         //   result ="You Lose"
            nombre="YOU LOSE"
            val bundle = bundleOf("final" to nombre,)
            view.findNavController().navigate(R.id.final1, bundle)
        }else if(palabra==oldString){
       //     val action = JuegoDirections.actionJuegoToFinal1(nombre)
         //   view.findNavController().navigate(action)
            nombre="YOU WIN"
            val bundle = bundleOf("final" to nombre,)
            view.findNavController().navigate(R.id.final1, bundle)
        }else {
            textView5.setText(oldString)
            textViewIntentos.setText(intento.toString())
        }
    }
}
