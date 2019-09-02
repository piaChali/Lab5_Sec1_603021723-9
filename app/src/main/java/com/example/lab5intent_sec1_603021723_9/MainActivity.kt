package com.example.lab5intent_sec1_603021723_9

import android.content.Intent
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Bundle as Bundle1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("stdData", Student(IdEDT.text.toString(),nameEDT.text.toString(),
            ageEDT.text.toString().toInt()))
        startActivity(intent)
    }
}
