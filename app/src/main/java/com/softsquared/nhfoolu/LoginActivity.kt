package com.softsquared.nhfoolu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        kakao_button.setOnClickListener{
            var intent= Intent(this,InvestActivity::class.java)

            startActivity(intent)

            finish()


        }
    }
}