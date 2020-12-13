package com.softsquared.nhfoolu

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_all_back_list.*
import kotlinx.android.synthetic.main.activity_register_account.*

class AllBackListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_back_list)
        setWindow()
        click_nhbank_all_back_list.setOnClickListener{

            val intent = Intent()
            intent.putExtra("data", "농협은행")

            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    private fun setWindow() {
        window.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.setGravity(Gravity.BOTTOM)
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL, WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);
//          바깥쪽 클릭 방지
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH, WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH);
//
    }
}