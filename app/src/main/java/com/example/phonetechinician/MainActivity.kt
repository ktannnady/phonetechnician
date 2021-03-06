package com.example.phonetechinician

import android.os.Bundle
import android.view.ViewGroup
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
//        val layoutParams:CoordinatorLayout.LayoutParams = ViewGroup.getLayoutparams()

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
         //val appBarConfiguration = AppBarConfiguration(setOf(
           //     R.id.navigation_home, R.id.navigation_search, R.id.navigation_profile, R.id.navigation_settings))
        //setupActionBarWithNavController(navController)
        navView.setupWithNavController(navController)
    }
}