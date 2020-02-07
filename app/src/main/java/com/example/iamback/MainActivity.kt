package com.example.iamback

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private var btn1: Button? = null
    private var btn2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.button_1)
        btn2 = findViewById(R.id.button_2)

        btn1?.setOnClickListener {

            val snackbar: Snackbar =
                Snackbar.make(it, "This is Comeback Game, That's it!", Snackbar.LENGTH_LONG)

            snackbar.show()
        }

        btn2?.setOnClickListener {
            Toast.makeText(applicationContext, "This is a simple TOAST Message", Toast.LENGTH_LONG)
                ?.show()
        }


    }
}
