package com.example.ordiihc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_material_window.*
import kotlinx.android.synthetic.main.activity_custom_list.*
import kotlinx.android.synthetic.main.activity_custom_list.agregar

class addMaterialWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_material_window)

        agregar.setOnClickListener {
            val addIntent= Intent(this,actionConfirm::class.java)
            startActivity(addIntent)
        }

        cancelar.setOnClickListener {
            val addIntent= Intent(this,custom_list::class.java)
            startActivity(addIntent)
        }
    }
}
