package com.example.ordiihc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_logout_window.*
//import kotlinx.android.synthetic.main.activity_listado_materiales.*


class logoutWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout_window)

        cancelar.setOnClickListener {
            val cancelIntent= Intent(this,custom_list::class.java)
            startActivity(cancelIntent)
        }

        cerrarSesion.setOnClickListener {
            val logoutIntent= Intent(this,MainActivity::class.java)
            startActivity(logoutIntent)
        }
    }
}
