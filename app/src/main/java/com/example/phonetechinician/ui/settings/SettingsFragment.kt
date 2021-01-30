package com.example.phonetechinician.ui.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.phonetechinician.Pembayaran
import com.example.phonetechinician.ProfileTeknisi
import com.example.phonetechinician.R
import com.example.phonetechinician.Setting
import kotlinx.android.synthetic.main.fragment_settings.*

class SettingsFragment : Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_settings, container, false)

        val button1 : Button =  root.findViewById(R.id.button1)
        val button2 : Button =  root.findViewById(R.id.button2)

        button1.setOnClickListener{
            val intent = Intent(this.context, Setting::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener{
            val intent = Intent(this.context, Pembayaran::class.java)
            startActivity(intent)
        }

        return root
    }
}