package com.example.phonetechinician


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_teknisi_terbaik_popup.*
import java.util.ArrayList

class TeknisiTerbaikPopup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        overridePendingTransition(0, 0)
        setContentView(R.layout.activity_teknisi_terbaik_popup)

        val listName: ArrayList<String>? = intent.getStringArrayListExtra("listName")
        val listRating: ArrayList<String>? = intent.getStringArrayListExtra("listRating")
        val listAchievement: ArrayList<String>? = intent.getStringArrayListExtra("listAchievement")
        val listDistance: ArrayList<String>? = intent.getStringArrayListExtra("listDistance")


        tvTechnicianName1.apply{text = listName!![0] }
        tvTechnicianName2.apply{text = listName!![1] }
        tvTechnicianName3.apply{text = listName!![2] }
        tvTechnicianName4.apply{text = listName!![3] }
        tvTechnicianName5.apply{text = listName!![4] }

        tvTechnicianStar1.apply{text = listRating!![0] }
        tvTechnicianStarNearby2.apply{text = listRating!![1] }
        tvTechnicianStarNearby3.apply{text = listRating!![2] }
        tvTechnicianStarNearby4.apply{text = listRating!![3] }
        tvTechnicianStarNearby5.apply{text = listRating!![4] }

        tvTechnicianAchievement1.apply{text = listAchievement!![0] }
        tvTechnicianAchievement2.apply{text = listAchievement!![1] }
        tvTechnicianAchievement3.apply{text = listAchievement!![2] }
        tvTechnicianAchievement4.apply{text = listAchievement!![3] }
        tvTechnicianAchievement5.apply{text = listAchievement!![4] }

        tvTechnicianDistance1.apply{text = listDistance!![0] }
        tvTechnicianDistance2.apply{text = listDistance!![1] }
        tvTechnicianDistance3.apply{text = listDistance!![2] }
        tvTechnicianDistance4.apply{text = listDistance!![3] }
        tvTechnicianDistance5.apply{text = listDistance!![4] }

        teknisi1.setOnClickListener{
            val intent = Intent(this, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Salam kenal nama saya ${listName?.get(0)}")
                putExtra("name", listName?.get(0))
                putExtra("status", "Online")
                putExtra("desc", "Silahkan bertanya - tanya kepada saya")
                putExtra("email", "${listName?.get(0)}@gmail.com")
                putExtra("hp", "+621231313")
                putExtra("address", "Jl. Sutomo no 29")
            }
            startActivity(intent)
        }

        teknisi2.setOnClickListener{
            val intent = Intent(this, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Salam kenal nama saya ${listName?.get(1)}")
                putExtra("name", listName?.get(1))
                putExtra("status", "Online")
                putExtra("desc", "Silahkan bertanya - tanya kepada saya")
                putExtra("email", "${listName?.get(1)}@gmail.com")
                putExtra("hp", "+621231313")
                putExtra("address", "Jl. Sutomo no 29")
            }
            startActivity(intent)
        }

        teknisi3.setOnClickListener{
            val intent = Intent(this, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Salam kenal nama saya ${listName?.get(2)}")
                putExtra("name", listName?.get(2))
                putExtra("status", "Online")
                putExtra("desc", "Silahkan bertanya - tanya kepada saya")
                putExtra("email", "${listName?.get(2)}@gmail.com")
                putExtra("hp", "+621231313")
                putExtra("address", "Jl. Sutomo no 29")
            }
            startActivity(intent)
        }

        teknisi4.setOnClickListener{
            val intent = Intent(this, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Salam kenal nama saya ${listName?.get(3)}")
                putExtra("name", listName?.get(3))
                putExtra("status", "Online")
                putExtra("desc", "Silahkan bertanya - tanya kepada saya")
                putExtra("email", "${listName?.get(3)}@gmail.com")
                putExtra("hp", "+621231313")
                putExtra("address", "Jl. Sutomo no 29")
            }
            startActivity(intent)
        }

        teknisi5.setOnClickListener{
            val intent = Intent(this, ProfileTeknisi::class.java).apply{
                putExtra("intro", "Salam kenal nama saya ${listName?.get(4)}")
                putExtra("name", listName?.get(4))
                putExtra("status", "Online")
                putExtra("desc", "Silahkan bertanya - tanya kepada saya")
                putExtra("email", "${listName?.get(4)}@gmail.com")
                putExtra("hp", "+621231313")
                putExtra("address", "Jl. Sutomo no 29")
            }
            startActivity(intent)
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}