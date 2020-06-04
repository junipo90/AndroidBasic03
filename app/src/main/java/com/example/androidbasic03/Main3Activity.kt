package com.example.androidbasic03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val numberList = (0..100).toList().shuffled()

        val dataAdapter = DataAdapter(numberList)

        dataAdapter.onItemSelectionChangedListener = {
            println("선택된 ID : $it")
        }

        integerList.adapter = dataAdapter
        integerList.layoutManager = LinearLayoutManager(this)
    }
}
