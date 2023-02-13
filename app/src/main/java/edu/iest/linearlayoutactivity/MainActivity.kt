package edu.iest.linearlayoutactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var bnSuma : Button? = null
    private var bnResta : Button? = null
    private var etNumeroPrimero : EditText? = null
    private var etNumeroSegundo : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inicializarVistas()
        asignarEventos()
    }

    //Metodo que asigna las vistas de layout a nuestras variables

    private fun inicializarVistas(){
        bnSuma = findViewById(R.id.bnSuma)
        bnResta = findViewById(R.id.bnResta)
        etNumeroPrimero = findViewById(R.id.etNumeroPrimero)
        etNumeroSegundo = findViewById(R.id.etNumeroSegundo)
    }

    private fun asignarEventos(){
        bnSuma?.setOnClickListener (this)
        bnResta?.setOnClickListener (this)
    }

    override fun onClick(p0: View?) {
        //aqui entrara los click de las vistas
        val numeroUno = etNumeroPrimero?.text.toString().toFloatOrNull()
        val numeroDos = etNumeroSegundo?.text.toString().toFloatOrNull()
        if (numeroUno == null)
            return
        if (numeroDos == null)
            return

        val aritmetica = Aritmetica()

        when(p0?.id){
            R.id.bnSuma -> {
                val suma = aritmetica.suma(numeroUno,numeroDos)
                val mensaje = Mensajes("La sumatoria fue $suma", context = this)
                mensaje.mostrarToast()
            }
            R.id.bnResta -> {
                val resta = aritmetica.suma(numeroUno,numeroDos)
                val mensaje = Mensajes("El resultado es $resta", context = this)
                mensaje.mostrarSnackbar(p0)
            }
        }
    }
}