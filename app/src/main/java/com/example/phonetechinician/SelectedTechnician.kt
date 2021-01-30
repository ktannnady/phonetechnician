package com.example.phonetechinician

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_profile_teknisi.*
import kotlinx.android.synthetic.main.chat.*
import kotlinx.android.synthetic.main.chat.backButton
import kotlinx.android.synthetic.main.fragment_home.*

class SelectedTechnician : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chat)

        val userMessage = intent.getStringExtra("userMessage")
        val technicianMessage = intent.getStringExtra("technicianMessage")
        val technicianStatus = intent.getStringExtra("technicianStatus")
        val technicianName = intent.getStringExtra("technicianName")

        backButton.setOnClickListener{
            finish()
        }

        tvTechnicianName.apply {text = technicianName}
        tvTechnicianStatus.apply{text = technicianStatus}
        tvUserMessage.apply{text = userMessage}
        tvTechnicianMessage.apply{text = technicianMessage}
    }
}