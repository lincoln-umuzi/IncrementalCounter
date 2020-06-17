package com.laynkulan.incrementalcounter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val increment: Button = findViewById(R.id.btnIncrement)
        val decrement: Button = findViewById(R.id.btnDecrement)
        increment.setOnClickListener(this)
        decrement.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        try {
            val check: Int = Integer.parseInt(txtEdit.text.toString())
            when (p0?.id) {
                R.id.btnIncrement -> {
                    txtView.text = (check + Integer.parseInt(txtView.text.toString())).toString()
                    Toast.makeText(this, " $check was added ", Toast.LENGTH_SHORT)
                        .show()
                }
                R.id.btnDecrement -> {
                    txtView.text = (Integer.parseInt(txtView.text.toString()) - check).toString()
                    Toast.makeText(this, " $check was subtracted ", Toast.LENGTH_SHORT)
                        .show()
                }
                else -> {
                }
            }
        } catch (e: Exception) {
            Toast.makeText(this, "The data you used is incorrect, please use numerical values", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
