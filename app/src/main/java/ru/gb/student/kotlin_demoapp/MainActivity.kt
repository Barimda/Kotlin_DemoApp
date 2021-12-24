package ru.gb.student.kotlin_demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
    }

    private fun showToastWithObjectInformation() {
        val obj = User.getData()
        val cutomObj = obj.copy("AnyName", 100)
        Toast.makeText(this, "Default username: " + cutomObj.Name + "\nDefault age: " + cutomObj.Age, Toast.LENGTH_LONG)
    }

    private fun initView() {
        val user = UsersData("Dmitry",23)
        findViewById<Button>(R.id.button).setOnClickListener { v -> findViewById<TextView>(R.id.textView).setText("Custom username: " + user.Name + "\nCustom age: " + user.Age) }

        showToastWithObjectInformation()

        writeInLogMessageCycle()
    }

    private fun writeInLogMessageCycle() {
        for (i in 1..10){
            Log.println(Log.DEBUG,"customLog", i.toString())
        }

        for (i in 25 downTo 1 step 5){
            println("step " + i)
        }
    }
}