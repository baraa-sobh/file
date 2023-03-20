package com.example.failbdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.failbdf.databinding.ActivityMainBinding
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var req = 100
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var storage = Firebase.storage
        var ref = storage.reference
        ref.child("path/to/pdf/file.pdf")
        binding.button.setOnClickListener {



        }

    }
}