package com.example.phonetechinician.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.phonetechinician.ProfileTeknisi
import com.example.phonetechinician.R
import com.example.phonetechinician.TeknisiTerbaikPopup
import com.example.phonetechinician.TeknisiTerdekatPopup
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        
        val listName: ArrayList<String> = ArrayList()
        listName.add("Budi Murni")
        listName.add("Kevin Muahaha")
        listName.add("Mamar Martin")
        listName.add("Michigan")
        listName.add("Alfaerda")

        val listRating: ArrayList<String> = ArrayList()
        listRating.add("4.9")
        listRating.add("4.8")
        listRating.add("4.3")
        listRating.add("4.1")
        listRating.add("3.9")

        val listAchievement: ArrayList<String> = ArrayList()
        listAchievement.add("Sudah memperbaiki 150 smartphone")
        listAchievement.add("Sudah memperbaiki 120 smartphone")
        listAchievement.add("Sudah memperbaiki 50 smartphone")
        listAchievement.add("Sudah memperbaiki 30 smartphone")
        listAchievement.add("Sudah memperbaiki 20 smartphone")

        val listDistance: ArrayList<String> = ArrayList()
        listDistance.add("1.2km dari Lokasi Anda")
        listDistance.add("1km dari Lokasi Anda")
        listDistance.add("500m dari Lokasi Anda")
        listDistance.add("300m dari Lokasi Anda")
        listDistance.add("255m dari Lokasi Anda")

        val tvTechnicianTerbaik: TextView = root.findViewById(R.id.tvTechnicianTerbaik)
        val tvTechnicianTerdekat: TextView = root.findViewById(R.id.tvTechnicianTerdekat)
        val teknisiTerbaik1: LinearLayoutCompat = root.findViewById(R.id.teknisiTerbaik1)
        val teknisiTerbaik2: LinearLayoutCompat = root.findViewById(R.id.teknisiTerbaik2)
        val teknisiTerbaik3: LinearLayoutCompat = root.findViewById(R.id.teknisiTerbaik3)
        val teknisiTerdekat1: LinearLayoutCompat = root.findViewById(R.id.teknisiTerdekat1)
        val teknisiTerdekat2: LinearLayoutCompat = root.findViewById(R.id.teknisiTerdekat2)
        val teknisiTerdekat3: LinearLayoutCompat = root.findViewById(R.id.teknisiTerdekat3)

        tvTechnicianTerbaik.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, TeknisiTerbaikPopup::class.java).apply {
                putStringArrayListExtra("listName", listName)
                putStringArrayListExtra("listRating", listRating)
                putStringArrayListExtra("listAchievement", listAchievement)
                putStringArrayListExtra("listDistance", listDistance)
            }
            startActivity(intent)
        }

        tvTechnicianTerdekat.setOnClickListener {
            val intent = Intent(this@HomeFragment.context, TeknisiTerdekatPopup::class.java).apply {
                putStringArrayListExtra("listName", listName)
                putStringArrayListExtra("listRating", listRating)
                putStringArrayListExtra("listAchievement", listAchievement)
                putStringArrayListExtra("listDistance", listDistance)
            }
            startActivity(intent)
        }

        teknisiTerbaik1.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Hello World! Nama saya Budi Murni")
                putExtra("name", "Budi Murni")
                putExtra("status", "Online")
                putExtra("desc", "Saya adalah teknisi yang sangat teliti dan jujur!")
                putExtra("email", "BudiMurni@gmail.com")
                putExtra("hp", "+62112329292")
                putExtra("address", "Jl.Mantap mantap no 123")
            }
            startActivity(intent)
        }

        teknisiTerbaik2.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Selamat Datang! Nama saya Kevin Muahaha")
                putExtra("name", "Kevin Muahaha")
                putExtra("status", "Online")
                putExtra("desc", "Saya adalah teknisi yang sudah sangat lama mendalami bidang ini! Jika ada kendala jangan lupa kirim pesan kepada saya ya!")
                putExtra("email", "Muahahaha@gmail.com")
                putExtra("hp", "+62666123555")
                putExtra("address", "Jl.Cipto simpang amir no 47")
            }
            startActivity(intent)
        }

        teknisiTerbaik3.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Hai Guys! Kembali lagi bersama saya Mamar Martin")
                putExtra("name", "Mamar Martin")
                putExtra("status", "Online")
                putExtra("desc", "Teknisi adalah jalan ninja saya!")
                putExtra("email", "NinjaTeknisi@gmail.com")
                putExtra("hp", "+62112355000")
                putExtra("address", "Jl.Verta no 590")
            }
            startActivity(intent)
        }

        teknisiTerdekat1.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Helloo perkenalkan saya Sang Butanol!")
                putExtra("name", "Sang Butanol")
                putExtra("status", "Online")
                putExtra("desc", "Berikan saya 1 teknisi, akan saya guncangkan dunia perhenponnan!")
                putExtra("email", "TukangGuncang@gmail.com")
                putExtra("hp", "+62292551220")
                putExtra("address", "Jl.Guncang no 49")
            }
            startActivity(intent)
        }

        teknisiTerdekat2.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Hello There! My name is JBL")
                putExtra("name", "JBL")
                putExtra("status", "Online")
                putExtra("desc", "Apa yang bisa saya lakukan untuk anda?")
                putExtra("email", "JBLTechnician@gmail.com")
                putExtra("hp", "+62202120220")
                putExtra("address", "Jl.Vihara no 123")
            }
            startActivity(intent)
        }

        teknisiTerdekat3.setOnClickListener{
            val intent = Intent(this@HomeFragment.context, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Prepare for trouble, make it double! Nama saya Parusuh!")
                putExtra("name", "Parusuh")
                putExtra("status", "Online")
                putExtra("desc", "Blast off at the speed of light!")
                putExtra("email", "TeamRocket@gmail.com")
                putExtra("hp", "+62228282811")
                putExtra("address", "Jl. Sutomo no 29")
            }
            startActivity(intent)
        }

        return root
    }
}