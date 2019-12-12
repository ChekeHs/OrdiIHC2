package com.example.ordiihc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_quantity_edit_window.*

class quantityEditWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quantity_edit_window)

        aceptar.setOnClickListener {
            val acceptIntent= Intent(this,actionConfirm::class.java)
            startActivity(acceptIntent)
        }

        cancelar.setOnClickListener {
            val declineIntent= Intent(this,custom_list::class.java)
            startActivity(declineIntent)
        }
    }
}
