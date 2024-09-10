package com.example.dynamicfragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dynamicfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // in java, its getFragmentManager
        // in kotlin, its supportFragmentManager
//        val fragMan = supportFragmentManager
// when you want to attach fragment or detach fragment, such thing is called transaction


        binding.btnFruits.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.flFragContainer,
                    FruitsFragment()
                )
                .commit()
        }

        binding.btnVegetables.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.flFragContainer,
                    VegetablesFragment()
                )
                .commit()
        }
    }
}