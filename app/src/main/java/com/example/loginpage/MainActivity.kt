package com.example.loginpage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.core.content.ContextCompat
import com.example.loginpage.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.statusBackground)

        with(binding) {
            val username = "dwiagungfebriyanto"
            val password = "mobile"

            loginBtn.setOnClickListener{
                val valueUsn = usn.text.toString()
                val valuePass = pass.text.toString()

                if (valueUsn == username && valuePass == password) {
                    Toast.makeText(
                        this@MainActivity,
                        "Login Sukses",
                        Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(
                        this@MainActivity,
                        "Login Gagal",
                        Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}