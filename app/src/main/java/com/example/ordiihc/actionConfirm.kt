package com.example.ordiihc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_action_confirm.*
import kotlinx.android.synthetic.main.activity_custom_list.*

class actionConfirm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_confirm)

        aceptar.setOnClickListener {
            val logoutIntent= Intent(this,custom_list::class.java)
            startActivity(logoutIntent)
        }

        cancelar.setOnClickListener {
            val logoutIntent= Intent(this,custom_list::class.java)
            startActivity(logoutIntent)
        }
    }
}
