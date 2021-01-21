package com.example.wikifoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wikifoods.Adapter.Adapter
import com.example.wikifoods.Adapter.Food
import com.example.wikifoods.Adapter.FoodData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_recylcer)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerCardView()

        btn_profil.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
        }

    }

    private fun showRecyclerCardView() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val Adapter = Adapter(list)
        rvFood.adapter = Adapter

        Adapter.setOnItemClickCallback(object : Adapter.OnItemClickCallback {

            override fun onItemClicked(data: Food) {
                val Intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.Name, data.name)
                        putExtra(DetailActivity.Image, data.photo)
                        putExtra(DetailActivity.Detail, data.detail)
                        putExtra(DetailActivity.Asal, data.asal)
                        putExtra(DetailActivity.Sajian, data.sajian)
                        putExtra(DetailActivity.Rank, data.rank)
                    }
                startActivity(Intent)
            }
        })
    }

    private fun showSelectedFood(food: Food) {
        Toast.makeText(this, "Kamu memilih " + food.name, Toast.LENGTH_SHORT).show()
    }

}