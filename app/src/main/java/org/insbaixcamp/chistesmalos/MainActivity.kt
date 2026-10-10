package org.insbaixcamp.chistesmalos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val textViewChiste = findViewById<TextView>(R.id.textView)
        val btnGenerar = findViewById<Button>(R.id.button)

    //Aqui fiquem el chistes
        val chistes = listOf(
            "—¿Qué le dice una iguana a su hermana gemela?\n—Somos iguanitas.",
            "—Mamá, en el colegio me llaman despistado.\n—Niño, que esta no es tu casa.",
            "—¿Cómo se llama el pez más limpio del océano?\n—El pez-punte.",
            "—¿Por qué los pájaros no usan teléfono móvil?\n—Porque ya tienen Twitter.",
            "—¿Qué hace un perro con un taladro?\n—Ta-ladrando.",
            "—Cariño, dime algo con amor.\n—Amortiguador.",
            "—Doctor, ¿cuánto me queda de vida?\n—Diez.\n—¿Diez qué? ¿Años, meses...?\n—Nueve, ocho, siete...",
            "—¿Cuál es el café más peligroso del mundo?\n—El ex-preso.",
            "—¿Qué le dice un cero a otro cero?\n—No somos nada."
            
        )

        btnGenerar.setOnClickListener {
            val chisteAleatorio = chistes.random()
            textViewChiste.text = chisteAleatorio
        }
    }



}