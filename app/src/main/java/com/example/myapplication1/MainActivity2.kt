package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    val clickBtn = findViewById<Button>(R.id.Click)
    val numVar = findViewById<TextView>(R.id.increasingNum)
    var index = 0

    clickBtn.setOnClickListener
        index += 1
        numVar.text = "$index"
    }

  }

}