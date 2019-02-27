package ru.geekbrains.kotlinproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var buttonTest: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonTest = buttonTest!!.findViewById<View>(R.id.buttonTest) as Button

        buttonTest!!.setOnClickListener { Toast.makeText(this@MainActivity, R.string.toast_hello, Toast.LENGTH_SHORT).show() }
    }
}
