package com.example.us___arg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Le pongo color a mi actionBar
        supportActionBar?.setBackgroundDrawable(resources.getDrawable(R.drawable.gradientbackground))



        // seteo editext2 con el valor que utilice de la multiplicacion del editext
        editext.setOnKeyListener{ view: View, i: Int, keyEvent: KeyEvent ->

            if (keyEvent.action == KeyEvent.ACTION_DOWN &&
                    i == KeyEvent.KEYCODE_ENTER
            ) {

                val valor=editext.text.toString().toInt()*40


                editext2.editableText.append(valor.toString())


                editext2.clearFocus()
                editext2.isCursorVisible = true


                return@setOnKeyListener true
            }
            return@setOnKeyListener false
        }


        // seteo editext con el valor que utilice de la multiplicacion del editext2
        editext2.setOnKeyListener{ view: View, i: Int, keyEvent: KeyEvent ->


            if (keyEvent.action == KeyEvent.ACTION_DOWN &&
                    i == KeyEvent.KEYCODE_ENTER
            ) {

                val valor=editext2.text.toString().toInt()/40


                editext.editableText.append(valor.toString())


                editext.clearFocus()

                editext.isCursorVisible = true


                return@setOnKeyListener true
            }
            return@setOnKeyListener false
        }




        // seteando boton de borrado
        botonBorrado.setOnClickListener {

            Toast.makeText(this, "Limpio", Toast.LENGTH_SHORT).show()
            editext.setText("")
            editext2.setText("")
        }




    }




}

