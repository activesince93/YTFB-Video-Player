package com.activesince93.ytfbplayer

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devbrackets.android.exomedia.listener.OnPreparedListener
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_live_facebook.*
import kotlinx.android.synthetic.main.activity_live_youtube.*

class LiveFacebookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_facebook)

        initViews()
    }

    private fun initViews() {
        facebookPlayer.setAutoPlayerHeight(this)
        facebookPlayer.initialize(Constants.FACEBOOK_APP_ID, Constants.FACEBOOK_VIDEO_URL)
        facebookPlayer.play()
    }

    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, LiveFacebookActivity::class.java)
            context.startActivity(intent)
        }
    }
}
