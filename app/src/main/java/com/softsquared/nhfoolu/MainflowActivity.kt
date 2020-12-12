package com.softsquared.nhfoolu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainflowActivity : AppCompatActivity() {

    private val mBottomNavigationView: BottomNavigationView? = null
    private val mfragmentManager = supportFragmentManager
    private val mFragmentTransaction: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_home)


    }
}