package edu.iest.linearlayoutactivity

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class Mensajes(var mensaje: String, var context: Context) {
    fun mostrarToast(){
        Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()
    }

    fun mostrarSnackbar(p0: View){
        Snackbar.make(p0,mensaje,Snackbar.LENGTH_LONG).show()
    }
}