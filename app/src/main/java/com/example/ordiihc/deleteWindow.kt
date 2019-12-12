package com.example.ordiihc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_custom_list.*
import kotlinx.android.synthetic.main.activity_logout_window.*

class deleteWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_window)

       cancelar.setOnClickListener {
            //Toast.makeText(this, "Botón para editar el registro con ID: ", Toast.LENGTH_LONG).show()
            val cancelIntent= Intent(this,custom_list::class.java)
            startActivity(cancelIntent)
        }

        eliminar.setOnClickListener {
            //Toast.makeText(this, "Botón para eliminar el registro con ID: ", Toast.LENGTH_LONG).show()
            val deleteIntent= Intent(this,custom_list::class.java)
            startActivity(deleteIntent)
        }

    }
}
