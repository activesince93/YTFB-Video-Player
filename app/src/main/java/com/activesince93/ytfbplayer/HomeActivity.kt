package com.activesince93.ytfbplayer

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by Darshan Parikh on 29/04/20.
 */

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun onYouTubeClicked(view: View) {
        LiveYoutubeActivity.startActivity(this)
    }
    fun onFacebookClicked(view: View) {
        LiveFacebookActivity.startActivity(this)
    }
}