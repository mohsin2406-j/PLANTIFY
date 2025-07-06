package nimoinfo.nify.plantify.ui.base

import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Looper
import nimoinfo.nify.plantify.R
import nimoinfo.nify.plantify.ui.home.HomeMainActivity
import nimoinfo.nify.plantify.ui.login.LoginActivity
import nimoinfo.nify.plantify.ui.utils.PreferenceHelper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            if (PreferenceHelper.isUserLoggedIn(this)) {
                if (PreferenceHelper.getOnBoardingShow(this) == "true") {
                    startActivity(Intent(this, HomeMainActivity::class.java))
                }else{
                    startActivity(Intent(this, LoginActivity::class.java))
                }
            }else{
                startActivity(Intent(this, OnboardingActivity::class.java))
            }

            finish()
        },2000)
    }
}
