package com.example.juego.Juego

import android.R.attr
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModel
import java.util.*
import android.R.attr.x
import java.lang.StringBuilder
import android.R.attr.data





class JuegoViewModel : ViewModel() {

    private lateinit var palabras: MutableList<String>
    fun Cargar_palabras(texto_adivina: TextView): String {
        palabras = mutableListOf(
            "Minar",
            /*"Chismoso",
            "Inhalar",
            "Linda",
            "Monja",
            "Ingles",
            "Pequeño",
            "Catedral",
            "Cochera",
            "Pierna"*/
        )
        Collections.shuffle(palabras)
        val random: String = palabras.get(0)
        var random_escondida: String = ""
        var i: Int = 0

        while (i < random.length) {
            random_escondida += "_ "
            i++
        }
        texto_adivina.setText(random_escondida)
        return random
    }

    fun adivina(letra: EditText, palabra: String, textView5: TextView) {

        var letra: String = letra.text.toString()


        var oldString:String=textView5.text.toString()
        var newString:String=""
        var index: Int = 0
        var sb:String=""
        val charArray = oldString.toCharArray()

        while (index < palabra.length) {
            if (palabra[index].toString() == letra) {
                charArray[index] = letra[0]


            }
            index++
        }
        newString = String(charArray)
        textView5.setText(newString)

/*
while (i < palabra.length) {
            if (palabra[i].toString() == letra) {

                sb= StringBuilder(palabra_escondida).replace(i,i+1, letra).toString()


            }
            textView5.setText(sb)
            i++
        }
 */
    }
}
