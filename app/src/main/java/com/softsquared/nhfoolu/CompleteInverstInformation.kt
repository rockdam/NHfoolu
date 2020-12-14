package com.softsquared.nhfoolu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_complete_inverst_information.*

class CompleteInverstInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complete_inverst_information)

        back_investcomplete.setOnClickListener {


            finish()
        }
    }
}