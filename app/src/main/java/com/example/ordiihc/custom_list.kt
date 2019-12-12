package com.example.ordiihc
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_custom_list.*
import kotlinx.android.synthetic.main.activity_sign_up_window.*
import kotlinx.android.synthetic.main.activity_custom_list.*

class custom_list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        editarCantidad.setOnClickListener {
            val editIntent= Intent(this,quantityEditWindow::class.java)
            startActivity(editIntent)
        }

        eliminar.setOnClickListener {
            //Toast.makeText(this, "Botón para eliminar el registro con ID: ", Toast.LENGTH_LONG).show()
            val deleteIntent= Intent(this,deleteWindow::class.java)
            startActivity(deleteIntent)
        }

        cerrarSesion.setOnClickListener {
            val logoutIntent= Intent(this,logoutWindow::class.java)
            startActivity(logoutIntent)
        }

        agregar.setOnClickListener {
            val addIntent= Intent(this,addMaterialWindow::class.java)
            startActivity(addIntent)
        }




    }


}