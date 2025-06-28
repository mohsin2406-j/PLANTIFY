package nimoinfo.nify.plantify.ui.base

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import nimoinfo.nify.plantify.databinding.ActivityOnboardingBinding
import nimoinfo.nify.plantify.ui.home.HomeMainActivity
import nimoinfo.nify.plantify.ui.login.LoginActivity

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonGetStarted.setOnClickListener {
          startActivity(Intent(this,HomeMainActivity::class.java))
        }

        }
    }