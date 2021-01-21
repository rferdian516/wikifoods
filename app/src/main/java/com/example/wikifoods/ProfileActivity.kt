package com.example.wikifoods

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        btn_back.setOnClickListener {
            startActivity( Intent(this@ProfileActivity, MainActivity ::class.java ))
            finish()
        }

        rlv_phone.setOnClickListener {
            val phoneNumber = "081914836833"
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
        }
    }
}