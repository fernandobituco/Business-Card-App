package me.bituco.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.bituco.businesscard.R
import me.bituco.businesscard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}