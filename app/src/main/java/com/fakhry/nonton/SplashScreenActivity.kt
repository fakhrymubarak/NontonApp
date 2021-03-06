package com.fakhry.nonton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fakhry.nonton.onboarding.OnboardingOneActivity

/*
* Ini adalah halaman pertama yang akan terbuka
* Tidak ada fitur khsus disini, selain menahan
* aplikasi terbuka untuk beberapa detik.
*
* proses yang perlu dilakukan untuk melakukan commit
* 1. pastikan code kalian sudah up to date
* 2. tekan centang hijau yang berada di pojok kanan atas (commit)
* */

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        var handler = Handler()
        handler.postDelayed({
            val intent = Intent (this@SplashScreenActivity,
                OnboardingOneActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}
