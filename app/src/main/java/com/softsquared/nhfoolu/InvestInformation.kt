package com.softsquared.nhfoolu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_invest_information.*

class InvestInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_invest_information)

        investbutton_invest_information.setOnClickListener {

            var intent= Intent(this, RegisterInformation::class.java)

            startActivityForResult(intent, 1)
//
//            finish()

        }
    }
    companion object {
        var change : Int =0

    }
}