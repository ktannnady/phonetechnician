package com.example.phonetechinician

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.phonetechinician.model.Data
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.recycleview.view.*


class TestRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private var items: List<Data> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TestViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycleview, parent, false)
        )
    }

    override fun getItemCount(): Int{
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is TestViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    fun submitList(){
        val list = ArrayList<Data>()
        list.add(
            Data(
                "John Mendow",
                4.5f,
                "Sudah memperbaiki 120 smartphone",
                "500m dari lokasi Anda",
                "online",
                "Salam kenal nama saya John Mendow",
                "Saya siap membantu segala keperluan anda!",
                "+6212121212",
                "johnmendow@gmail.com",
                "Jl.Gaharu no 123"
            )
        )
        list.add(
            Data(
                "Harry Styles",
                4.2f,
                "Sudah memperbaiki 47 smartphone",
                "620m dari lokasi Anda",
                "online",
                "Salam kenal nama saya Harry Styles",
                "Saya siap membantu segala keperluan anda!",
                "+6215959512",
                "harryst@gmail.com",
                "Jl.Medan no 23"
            )
        )
        list.add(
            Data(
                "Si Cepat",
                4.0f,
                "Sudah memperbaiki 39 smartphone",
                "200m dari lokasi Anda",
                "online",
                "Salam kenal nama saya Si Cepat",
                "Saya siap membantu segala keperluan anda!",
                "+6212112302",
                "cepat@gmail.com",
                "Jl.cepatkan no 123"
            )
        )

        list.add(
            Data(
                "Adieu",
                3.9f,
                "Sudah memperbaiki 10 smartphone",
                "200m dari lokasi Anda",
                "online",
                "Salam kenal nama saya Adieu",
                "Saya siap membantu segala keperluan anda!",
                "+6210020202",
                "adieu@gmail.com",
                "Jl.Keripik no 123"
            )
        )

        list.add(
            Data(
                "Yama",
                3.85f,
                "Sudah memperbaiki 7 smartphone",
                "700m dari lokasi Anda",
                "online",
                "Salam kenal nama saya Yama",
                "Saya siap membantu segala keperluan anda!",
                "+62122020122",
                "Yama@gmail.com",
                "Jl.Penyanyi no 123"
            )
        )
        items = list
    }

    class TestViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val name = itemView.tvTechnicianName
        val rating = itemView.tvTechnicianStar
        val achievement = itemView.tvTechnicianAchievement
        val distance = itemView.tvTechnicianDistance
        val cardview = itemView.cardview

        fun bind(data: Data){
            name.setText(data.nama)
            rating.setText(data.rating.toString())
            achievement.setText(data.achievement)
            distance.setText(data.jarak)
            cardview.setOnClickListener{
                val intent = Intent(itemView.context, ProfileTeknisi::class.java).apply{
                    putExtra("intro", data.intro)
                    putExtra("name", data.nama)
                    putExtra("status", data.status)
                    putExtra("desc", data.desc)
                    putExtra("email", data.email)
                    putExtra("hp", data.hp)
                    putExtra("address", data.address)
                }
                itemView.context.startActivity(intent)
            }
        }
    }
}