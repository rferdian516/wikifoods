package com.example.wikifoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object {
        const val Name = "name"
        const val Image = "img"
        const val Detail = "detail"
        const val Asal = "asal"
        const val Sajian = "sajian"
        const val Rank = "rank"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        btn_back.setOnClickListener {
            startActivity(Intent(this@DetailActivity, MainActivity::class.java))
            finish()
        }

        btn_share.setOnClickListener {
            Toast.makeText(this, "Kamu membagikan " + tv_name.text, Toast.LENGTH_SHORT).show()
        }

        tv_name.text = intent.getStringExtra(Name)
        img_detail.setImageResource(intent.getIntExtra(Image, 0))
        tv_detail.text = intent.getStringExtra(Detail)
        tv_asal_kota.text = intent.getStringExtra(Asal)
        tv_saran_sajian.text = intent.getStringExtra(Sajian)
        tv_ranking.text = intent.getStringExtra(Rank)

    }
}