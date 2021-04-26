package com.example.appfinalcovid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.covid_view)
        val pays = arrayOf("usa")
        val cas = arrayOf("-4165683 case")
        val mort = arrayOf("-2530 death")
        val reco = arrayOf("4220061 recovered")

        listView.adapter = ListAdapter(this, pays, cas, mort, reco)
    }



}