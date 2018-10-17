package com.andreygomes.meuapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.andreygomes.minhabiblioteca.demo.Calculadora
import com.andreygomes.minhabiblioteca.toast.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val customToast = CustomToast(this, layoutInflater)

        if(BuildConfig.REPORT_CRASH) {
            //Toast.makeText(this, "Crash ligado", Toast.LENGTH_SHORT).show()
            customToast.showToast("Crash ligado", 1)
        } else {
            //Toast.makeText(this, "Crash desligado", Toast.LENGTH_SHORT).show()
            customToast.showToast("Crash desligado", 2)
        }

    }
}
