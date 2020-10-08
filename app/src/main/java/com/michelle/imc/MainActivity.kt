package com.michelle.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular(view: View) {

        val p :Double = peso.text.toString().toDouble()
        val a :Double = altura.text.toString().toDouble()
        val imc :Double = p/(a*a)
        saida.text = imc.toString()
        saida.text = String.format("%.2f", imc)

        //Toast.makeText( context: this, text: "teste", Toast.LENGTH_SHORT).show();


    }
}