package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    val enterNameInput = findViewById<EditText>(R.id.enterName)
    val okayButton = findViewById<Button>(R.id.okayBtn)
    val nameOutput = findViewById<TextView>(R.id.helloName)


    okayButton.setOnClickListener
        val inputText = enterNameInput.text.toString()
        nameOutput.text = "Hello, " + inputText + "!"
    }


        val nextButton = findViewById<Button>(R.id.nextBtn)
    nextButton.setOnClickListener {
        val Intent = Intent(this, MainActivity2::class.java)
        startActivity(Intent)
    }
  }
}
