package com.miempresa.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(){
            var num1 = num1.text.toString()
            var num2 = num2.text.toString()

            val intent:Intent = Intent(this,segunda::class.java)

            intent.putExtra("num1",num1)
            intent.putExtra("num2",num2)
            startActivity(intent)
        }

    }
}