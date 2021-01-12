package com.example.kotlinnoob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

       fun btn(view: View) {
          //val mes: String = editText.editableText.toString()
           Toast.makeText(this,"Button was Clicked and  or ", Toast.LENGTH_SHORT).show()
       }
}