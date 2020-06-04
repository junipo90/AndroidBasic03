package com.example.androidbasic03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class Main1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = listOf<FoodModel>(
            FoodModel("김밥", 2000),
            FoodModel("라면", 3000),
            FoodModel("떡볶이", 4000),
            FoodModel("라볶이", 4500),
            FoodModel("돈까스", 6000)
        )

        val dataAdapter = FoodDataAdapter(foodList)
        foodListView.adapter = dataAdapter
        foodListView.layoutManager = LinearLayoutManager(this)

    }
}
