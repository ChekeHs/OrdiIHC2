package com.example.ordiihc

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import kotlinx.android.synthetic.main.activity_main.contrasena
import kotlinx.android.synthetic.main.activity_main.correo
import kotlinx.android.synthetic.main.activity_sign_up_window.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se declara la variable en la que guardaremos los usuarios que se registren.
        val usuarios= arrayOf<String>()

        // Objeto llamado "preferencias" que tendrá la referencia al archivo de preferencias llamado "usuarios".
        val preferencias=getSharedPreferences("usuarios", Context.MODE_PRIVATE)

    login.setOnClickListener{

        if(correo.text.isEmpty() || contrasena.text.isEmpty() ){
            Toast.makeText(this,"Por favor llena todos los campos.",Toast.LENGTH_LONG).show()
        }
        else{

            val extras = intent.extras
            if (extras != null) {
                    // Do something
                    if(correo.text.toString()==intent.getStringExtra("loginEmail").toString() && contrasena.text.toString()==intent.getStringExtra("password").toString()) {
                        Toast.makeText(this,"Has iniciado sesión correctamente.",Toast.LENGTH_LONG).show()
                        val listPageIntent= Intent(this,custom_list::class.java)
                        startActivity(listPageIntent)
                        finish()

                    }
                    else{
                        Toast.makeText(this,"Los datos de inicio de sesión no son correctos.",Toast.LENGTH_LONG).show()
                    }

            }
            else {
                // Do something else
                Toast.makeText(this,"No existen datos de inicio de sesión.\nPor favor crea una cuenta nueva.",Toast.LENGTH_LONG).show()
            }


        }

    }

    signup.setOnClickListener {
        val signupIntent=Intent(this,SignUpWindow::class.java)
        startActivity(signupIntent)
    }

    }
}
