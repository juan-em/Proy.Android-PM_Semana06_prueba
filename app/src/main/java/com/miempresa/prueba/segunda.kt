package com.miempresa.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*

class segunda : AppCompatActivity() {
    fun sumar(num1:Double,num2:Double):Double{
        return num1+num2
    }
    fun restar(num1:Double,num2:Double):Double{
        return num1-num2
    }
    fun producto(num1:Double,num2:Double):Double{
        return num1*num2
    }
    fun division(num1:Double,num2:Double):Double{
        return num1/num2
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)
        val bundle:Bundle? = intent.extras
        if (bundle != null){
            var num1 = bundle.getString("num1").toString().toDouble()
            var num2 = bundle.getString("num2").toString().toDouble()

            var suma_rpta=(sumar(num1,num2)).toString()
            var resta_rpta=(restar(num1,num2)).toString()
            var producto_rpta=(producto(num1,num2)).toString()
            var division_rpta=(division(num1,num2)).toString()


            suma.setText("Suma = $suma_rpta")
            resta.setText("Resta = $resta_rpta")
            producto.setText("Producto = $producto_rpta")
            division.setText("Division = $division_rpta")
        }
    }
}