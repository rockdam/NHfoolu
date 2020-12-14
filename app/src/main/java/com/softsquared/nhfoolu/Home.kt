package com.softsquared.nhfoolu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Home.newInstance] factory method to
 * create an instance of this fragment.
 */
data class InvestList(val imageFile:Int , val title:String,val contents:String){}
class Home : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var arrayInvestList = ArrayList<InvestList>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }




//        arrayInvestList.add(InvestList(R.drawable.img_main_list_image,"10만명이 구독하는, 홈카페 몽드","전직 5성급 호텔 바리스타 몽드입니다.\n" +
//                "홈카페 유튜버를 하고 있습니다."))
//        arrayInvestList.add(InvestList(R.drawable.img_main_list_image_2,"BTS 스타일리스트, Gunny kim","132만명이 구독하는 스타일리스트,\n" +
//                "Gunny kim이 새로운 컨텐츠를 제작.."))
//        arrayInvestList.add(InvestList(R.drawable.img_main_list_image_3,"시청시간 최강자, 쿠킹 ASMR!","1인당 평균 재생시간 12시간, 쿠킹 AS\n" +
//                "MR을 하고 있습니다. 최근 쿠킹 클래.."))
//        arrayInvestList.add(InvestList(R.drawable.img_main_list_image_4,"ADOBE 디자이너, 유튜브 오픈!","ADOBE GUI Designer 가 진행하는\n" +
//                "유튜브 디자인 클래스입니다. 다양한.."))
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        var adapter =CustomAdapter2()
        val view =inflater.inflate(R.layout.fragment_home, container, false)
        view.recyclerView.adapter=CustomAdapter()
        view.recyclerView2.adapter=adapter
        adapter.onItemClick = { pos, view ->

            var intent= Intent(context, InvestInformation::class.java)

            startActivity(intent)



        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Home.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                Home().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}