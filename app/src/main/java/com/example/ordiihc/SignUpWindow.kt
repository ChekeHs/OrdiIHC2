package com.example.ordiihc

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up_window.*

class SignUpWindow : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_window)

        crearCuenta.setOnClickListener {
            //código para asegurarse de que ningún campo vaya vacío.
            if (nombre.text.isEmpty()||correo.text.isEmpty()||contrasena.text.isEmpty()||verifContrasena.text.isEmpty()){
                Toast.makeText(this,"Uno o más campos están vacíos.", Toast.LENGTH_LONG).show()
            }
            else{
                //Código para verificar que las dos contraseñas sean iguales.
                if(contrasena.text.toString()==verifContrasena.text.toString())
                {
                    //Ya se comprobó el funcionamiento hasta el Toast de la siguiente línea.
                    Toast.makeText(this,"Las contraseñas sí coinciden.", Toast.LENGTH_LONG).show()

                    /*Insertar los datos de la nueva cuenta en la base de datos. NO SIRVE.
                    val admin = AdminSQLiteOpenHelper(this,"administracion", null, 1)
                    val bd = admin.writableDatabase
                    val registro = ContentValues()
                    registro.put("correo", nombre.getText().toString())
                    registro.put("nombre", correo.getText().toString())
                    registro.put("contrasena", contrasena.getText().toString())
                    bd.insert("usuarios", null, registro)
                    bd.close()
                    Toast.makeText(this, "Se cargaron los datos del usuario.\n Nombre: ${nombre.text}\n Correo: ${correo.text}\n Contraseña: ${contrasena.text}", Toast.LENGTH_SHORT).show()
                    nombre.setText("")
                    correo.setText("")
                    contrasena.setText("")
                    verifContrasena.setText("")*/

                    Toast.makeText(this, "Se cargaron los datos del usuario.\n Nombre: ${nombre.text}\n Correo: ${correo.text}\n Contraseña: ${contrasena.text}", Toast.LENGTH_SHORT).show()

                    val nombre=nombre.text.toString()
                    val correo=correo.text.toString()
                    val contrasena=contrasena.text.toString()



                    val loginPageIntent= Intent(this,MainActivity::class.java)
                    loginPageIntent.putExtra("loginEmail",correo)
                    loginPageIntent.putExtra("password",contrasena)
                    loginPageIntent.putExtra("name",nombre)
                    startActivity(loginPageIntent)

                }
                else{
                    Toast.makeText(this,"Las contraseñas no coinciden.", Toast.LENGTH_LONG).show()
                    //Toast.makeText(this,"Contraseña 1: ${contrasena.text}\n Contraseña 2: ${verifContrasena.text}", Toast.LENGTH_LONG).show()
                }
            }
        }

        cancelar.setOnClickListener {
            val loginPageIntent= Intent(this,MainActivity::class.java)
            startActivity(loginPageIntent)
        }
    }


}
