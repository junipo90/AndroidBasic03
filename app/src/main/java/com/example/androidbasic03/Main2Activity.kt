package com.example.androidbasic03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val fruitList = listOf<SampleModel>(
            SampleModel(R.drawable.image01, "망고"),
            SampleModel(R.drawable.image02, "딸기&체리"),
            SampleModel(R.drawable.image03, "토마토"),
            SampleModel(R.drawable.image04, "수박"),
            SampleModel(R.drawable.image05, "오렌지"),
            SampleModel(R.drawable.image06, "체리")
        )

//        val dataAdapter = SampleDataAdapter(fruitList, R.layout.item_box1)
//        val dataAdapter = SampleDataAdapter(fruitList, R.layout.item_box2)
        val dataAdapter = SampleDataAdapter(fruitList, R.layout.item_box3)

        sampleListView.adapter = dataAdapter
//        sampleListView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
//        sampleListView.layoutManager = GridLayoutManager(this, 2)
        sampleListView.layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)

    }
}
