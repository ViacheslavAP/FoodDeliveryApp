package ru.perelyginva.shoplearn.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.perelyginva.shoplearn.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    private var _binding: ActivityStartBinding? = null
    private val binding: ActivityStartBinding
        get() = _binding ?: throw RuntimeException("Activity StartBinding == null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goUserLoginBtn.setOnClickListener {
            val intent = Intent(this@StartActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}