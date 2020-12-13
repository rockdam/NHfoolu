package com.softsquared.nhfoolu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val mfragmentManager = supportFragmentManager
    private var mFragmentTransaction: FragmentTransaction? = null
    private val mHomeFragment = Home.newInstance("", "")
    private val mReportFragment = Report.newInstance("", "")
    private val mMypage =Mypage.newInstance("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        mFragmentTransaction = mfragmentManager.beginTransaction()

        mFragmentTransaction?.replace(R.id.FrameChanger, mHomeFragment)
            ?.commitNowAllowingStateLoss()



        bottom_navigation_home.setOnNavigationItemSelectedListener { item ->
            mFragmentTransaction = mfragmentManager.beginTransaction()
            when (item.itemId) {
                R.id.home -> {
                    if (!mHomeFragment.isAdded) {
                        mFragmentTransaction?.replace(R.id.FrameChanger, mHomeFragment)
                            ?.commitNowAllowingStateLoss()
                        bottom_navigation_home.menu.findItem(R.id.home).isChecked = true
                    }

                }

                R.id.report -> {
                    if (!mReportFragment.isAdded) {
                        mFragmentTransaction?.replace(R.id.FrameChanger, mReportFragment)
                            ?.commitNowAllowingStateLoss()
                        bottom_navigation_home.menu.findItem(R.id.report).isChecked = true
                    }
                }
                R.id.mypage ->

                {


                    if (!mMypage.isAdded) {
                        mFragmentTransaction?.replace(R.id.FrameChanger, mMypage)
                                ?.commitNowAllowingStateLoss()
                        bottom_navigation_home.menu.findItem(R.id.mypage).isChecked = true
                    }
                }


            }
            true
        }

    }
}