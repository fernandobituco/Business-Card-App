package me.bituco.businesscard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.bituco.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListener()
    }

    private fun insertListener() {
        binding.ibClose.setOnClickListener{
            finish()
        }
    }
}