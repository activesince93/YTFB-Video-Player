package com.activesince93.ytfbplayer

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.google.android.youtube.player.YouTubeBaseActivity
import com.google.android.youtube.player.YouTubeInitializationResult
import com.google.android.youtube.player.YouTubePlayer
import kotlinx.android.synthetic.main.activity_live_youtube.*

class LiveYoutubeActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_youtube)

        youTubePlayerView.initialize(Constants.YOUTUBE_API, this)
    }

    override fun onInitializationSuccess(provider: YouTubePlayer.Provider?, player: YouTubePlayer?, wasRestored: Boolean) {
        player?.cueVideo(Constants.YOUTUBE_VIDEO_ID)
    }

    override fun onInitializationFailure(p0: YouTubePlayer.Provider?, p1: YouTubeInitializationResult?) {

    }

    companion object {
        fun startActivity(context: Context) {
            val intent = Intent(context, LiveYoutubeActivity::class.java)
            context.startActivity(intent)
        }
    }
}
