package com.softsquared.nhfoolu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_register_information.*

class RegisterInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_information)
        move_complete_invest_information.setOnClickListener {

            var intent = Intent(this, CompleteInverstInformation::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)

            finish()

        }

        nhdeposit_start.setOnClickListener {

            var intent = Intent(this, NHDeposit::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            InvestInformation.change += 3000
            startActivity(intent)
        }
        blanceDeposit.text = "" + InvestInformation.change +"원"

        if (InvestInformation.change != 0) {
            delete1.visibility = View.INVISIBLE
            delete2.visibility = View.INVISIBLE
            nhdeposit_start.visibility = View.INVISIBLE
        }


        backActivity.setOnClickListener {

            finish()

        }
    }

}