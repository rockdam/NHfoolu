package com.softsquared.nhfoolu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_invest.*

class InvestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invest)


        next_activity_invest.setOnClickListener{

            var intent= Intent(this, RegisterAccountActivity::class.java)

            startActivityForResult(intent, 1)

            finish()


        }



    }


}