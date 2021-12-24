package ru.gb.student.kotlin_demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun initView() {
        val user = UsersData("Dmitry",23);
        findViewById<Button>(R.id.button).setOnClickListener { v -> findViewById<TextView>(R.id.textView).setText(user.Name + " " + user.Age) }
    }
}