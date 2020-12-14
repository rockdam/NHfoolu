package com.softsquared.nhfoolu

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.investlist_itemlayout.view.*

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {



    var items:MutableList<InvestList> = mutableListOf(InvestList(R.drawable.img_main_list_image,"10만명이 구독하는, 홈카페 몽드","전직 5성급 호텔 바리스타 몽드입니다.\n" +
            "홈카페 유튜버를 하고 있습니다."),InvestList(R.drawable.img_main_list_image_2,"BTS 스타일리스트, Gunny kim","132만명이 구독하는 스타일리스트,\n" +
            "Gunny kim이 새로운 컨텐츠를 제작.."),InvestList(R.drawable.img_main_list_image_3,"시청시간 최강자, 쿠킹 ASMR!","1인당 평균 재생시간 12시간, 쿠킹 AS\n" +
            "MR을 하고 있습니다. 최근 쿠킹 클래.."),InvestList(R.drawable.img_main_list_image_4,"ADOBE 디자이너, 유튜브 오픈!","ADOBE GUI Designer 가 진행하는\n" +
            "유튜브 디자인 클래스입니다. 다양한..") )

    inner class CustomViewHolder(parent: ViewGroup):RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.investlist_itemlayout,parent,false))

    {

        val title =itemView.title_investlist
        val contents=itemView.contents_investlist
        val img =itemView.img_investlist

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder =CustomViewHolder(parent)
//https://medium.com/@limgyumin/%EC%BD%94%ED%8B%80%EB%A6%B0-%EC%9D%98-apply-with-let-also-run-%EC%9D%80-%EC%96%B8%EC%A0%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94%EA%B0%80-4a517292df29
//    let
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

    items[position].let { item ->
        with(holder) {
            title.text= item.title
            contents.text = item.contents

            img.setImageResource(item.imageFile)
        }
    }
    }

    override fun getItemCount(): Int=items.size
}