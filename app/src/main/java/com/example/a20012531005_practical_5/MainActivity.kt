package com.example.a20012531005_practical_5

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.os.Handler
import android.view.View
import android.widget.SeekBar
import kotlinx.coroutines.NonCancellable.start


class MainActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var runnable:Runnable
    private var handler: Handler = Handler()
    private var pause:Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        }

    fun play(view: View) {
        mediaPlayer = MediaPlayer.create(applicationContext,R.raw.song)
        mediaPlayer.start()
        Toast.makeText(this,"Media Playing",Toast.LENGTH_SHORT).show()
    }

    fun Stop(view: View) {
        mediaPlayer.stop()
        Toast.makeText(this,"Media Stopped",Toast.LENGTH_SHORT).show()
    }

    fun Pause(view: View) {
        mediaPlayer.pause()
        Toast.makeText(this,"Media Paused",Toast.LENGTH_SHORT).show()
    }
}



