package com.example.edittextbasicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var resultTxt:TextView ? = null
    private var editText:EditText ? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            resultTxt = findViewById(R.id.resultText)
            editText = findViewById(R.id.edittext)

    }

    fun onClick(view: View){
        var result:String = editText?.text.toString()

        resultTxt?.text = result
    }
}