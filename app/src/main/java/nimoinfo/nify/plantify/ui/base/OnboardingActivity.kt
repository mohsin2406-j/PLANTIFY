package nimoinfo.nify.plantify.ui.base

import android.R
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import nimoinfo.nify.plantify.databinding.ActivityOnboardingBinding
import nimoinfo.nify.plantify.ui.login.LoginActivity
import nimoinfo.nify.plantify.ui.utils.PreferenceHelper

class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ButtonGetStarted.setOnClickListener {

            startActivity(Intent(this, LoginActivity::class.java))
            PreferenceHelper.setOnBoardingShow(this,"true")
        }

    }
}
