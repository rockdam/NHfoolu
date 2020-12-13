package com.softsquared.nhfoolu

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_register_account.*

class RegisterAccountActivity : AppCompatActivity() {

    val requestCode=100
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_account)

        select_bank_activity_register.setOnClickListener{


            var intent= Intent(this,AllBackListActivity::class.java)

            startActivityForResult(intent,requestCode)

        }

        nextAcitivity_register_account.setOnClickListener {

            var intent= Intent(this,Step1Activity::class.java)

            startActivity(intent)
            finish()

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                100 -> {
                    selected_spinner_register_account.visibility = View.INVISIBLE
                    select_bank_activity_register.text = data?.getStringExtra("data")
                    nextAcitivity_register_account.background= ContextCompat.getDrawable(this, R.drawable.shape_full_purple)

                }
            }
        }
    }
}