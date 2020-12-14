package com.softsquared.nhfoolu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.hotinvestlist_itemlayout.view.*

class CustomAdapter2 : RecyclerView.Adapter<CustomAdapter2.CustomViewHolder>() {

    var onItemClick: ((pos: Int, view: View) -> Unit)? = null

    var items: MutableList<InvestList> = mutableListOf(InvestList(R.drawable.img_main_hotlist_a, "SM 전문 작곡가, COZYNOA", "SM 전문 작곡가, COZYNOA입니다. 현재 국내 유명 가수 및\n" +
            "아이돌을 위주로 작업을 진행하고 있습니다."), InvestList(R.drawable.img_main_hotlist_b, "동물계의 유튜버, 김삿갓", "고양이 7마리와 함께\n" +
            "1만명 구독자를 보유"))

    inner class CustomViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.hotinvestlist_itemlayout, parent, false)), View.OnClickListener {
        init {
            itemView.setOnClickListener(this)
        }
        val title = itemView.title_hotinvestlist
        val contents = itemView.contents_hotinvestlist
        val img = itemView.img_hotinvestlist
        override fun onClick(v: View?) {
            if (v != null) {
                onItemClick?.invoke(adapterPosition, v)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder = CustomViewHolder(parent)

    //https://medium.com/@limgyumin/%EC%BD%94%ED%8B%80%EB%A6%B0-%EC%9D%98-apply-with-let-also-run-%EC%9D%80-%EC%96%B8%EC%A0%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EB%8A%94%EA%B0%80-4a517292df29
//    let
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        items[position].let { item ->
            with(holder) {
                title.text = item.title
                contents.text = item.contents

                img.setImageResource(item.imageFile)
            }
        }


        }

        override fun getItemCount(): Int = items.size

}