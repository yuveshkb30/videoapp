package com.yuvesh.videoapp

import android.net.Uri
import android.net.Uri.parse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView=findViewById<VideoView>(R.id.simpleVideoView)
        val mediaController=MediaController(this@MainActivity)
        mediaController.setAnchorView(videoView)

        val uri:Uri=parse("android.resource://"+packageName+"/"+R.raw.video)
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}