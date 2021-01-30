package com.example.phonetechinician

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ArgbEvaluator
import android.animation.ValueAnimator
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.graphics.ColorUtils
import kotlinx.android.synthetic.main.activity_profile_teknisi.*
import kotlinx.android.synthetic.main.activity_profile_teknisi.backButton
import kotlinx.android.synthetic.main.activity_teknisi_terbaik_popup.*

class ProfileTeknisi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_teknisi)

        val email = intent.getStringExtra("email")
        val hp = intent.getStringExtra("hp")
        val desc = intent.getStringExtra("desc")
        val intro = intent.getStringExtra("intro")
        val address = intent.getStringExtra("address")
        val name = intent.getStringExtra("name")
        val status = intent.getStringExtra("status")

        backButton.setOnClickListener{
            finish()
        }

        val tvIntro = findViewById<TextView>(R.id.tvTechnicianIntro).apply {
            text = intro
        }

        val tvHp = findViewById<TextView>(R.id.tvTechnicianPhone).apply {
            text = hp
        }

        val tvDesc = findViewById<TextView>(R.id.tvTechnicianDesc).apply {
            text = desc
        }

        val tvEmail = findViewById<TextView>(R.id.tvTechnicianEmail).apply {
            text = email
        }

        tvTechnicianAddress.apply{text = address}

        btnChat.setOnClickListener{
            val intent = Intent(this, SelectedTechnician::class.java).apply{
                putExtra("userMessage", "Hallo, apakah ini dengan $name?")
                putExtra("technicianMessage", "Betul, ada yang bisa saya bantu?")
                putExtra("technicianName", name)
                putExtra("technicianStatus", status)
            }
            startActivity(intent)
        }
    }
}