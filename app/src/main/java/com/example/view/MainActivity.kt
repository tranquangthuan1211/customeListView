package com.example.view

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var listViewFood = findViewById<ListView>(R.id.list_view)
        var arrMonAn:ArrayList<Mon> = ArrayList()
        arrMonAn.add(Mon("sushi",R.drawable.imag1))
        arrMonAn.add(Mon("banh mi",R.drawable.image2))
        arrMonAn.add(Mon("hamberger",R.drawable.image3))
        arrMonAn.add(Mon("Mi",R.drawable.image4))
        arrMonAn.add(Mon("Tom",R.drawable.image5))
        arrMonAn.add(Mon("soup",R.drawable.image6))
        listViewFood.adapter = CustomeAdapter(this@MainActivity,arrMonAn)
    }
}