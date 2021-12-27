package ru.gb.student.kotlin_demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import ru.gb.student.kotlin_demoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.getRoot()
        setContentView(view)

        initView()
    }

    private fun showToastWithObjectInformation() {
        val obj = User.getData()
        val cutomObj = obj.copy("AnyName", 100)
        Toast.makeText(this, "Default username: ${cutomObj.Name} Default age: ${cutomObj.Age}", Toast.LENGTH_LONG).show()
    }

    private fun initView() {
        val user = UsersData("Dmitry",23)
        findViewById<Button>(R.id.button).setOnClickListener { v -> findViewById<TextView>(R.id.textView).setText("Custom username: ${user.Name} Custom age: ${user.Age}") }

        showToastWithObjectInformation()

        writeInLogMessageCycle()
    }

    private fun writeInLogMessageCycle() {
        for (i in 1..10){
            Log.println(Log.DEBUG,"customLog", i.toString())
        }

        for (i in 25 downTo 1 step 5){
            println("step $i")
        }
    }
}