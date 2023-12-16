package com.example.kotlinbasic

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.ImageButton
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    private val handler: Handler?=null
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var titleText: TextView
    private lateinit var timeText: TextView
    private lateinit var seekBar: SeekBar
    private lateinit var playBtn: ImageButton
    private lateinit var stopBtn: ImageButton
    private lateinit var forwardBtn: ImageButton
    private lateinit var rewindBtn: ImageButton
    private var finalTime: Double = 0.0
    private var startTime: Double = 0.0
    private var forwardTime: Int = 10000
    private var backwardTime: Int = 10000
    private var oneTimeOnly: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         titleText = findViewById(R.id.txtNama)
         timeText = findViewById(R.id.txtTime)
         seekBar = findViewById(R.id.seekBar)
         playBtn = findViewById(R.id.imgPlay)
         stopBtn = findViewById(R.id.imgPlay)
         forwardBtn = findViewById(R.id.imgFastForward)
        rewindBtn = findViewById(R.id.imgFastRewind)

        // Media Player
        mediaPlayer = MediaPlayer.create(this,R.raw.fix_you)

        // un click seekbar
        seekBar.isClickable = false

        // play btn
        playBtn.setOnClickListener {
            mediaPlayer.start()

            finalTime = mediaPlayer.duration.toDouble()
            startTime = mediaPlayer.currentPosition.toDouble()

            if(oneTimeOnly == 0){
                seekBar.max = finalTime.toInt()
                oneTimeOnly = 1
            }

            timeText.text = startTime.toString()
            seekBar.progress = startTime.toInt()

            handler?.postDelayed(updateSongTime,100)
        }

        // stop btn
        stopBtn.setOnClickListener {
            mediaPlayer.pause()
        }

        // forward btn
        forwardBtn.setOnClickListener {
            var temp = startTime
            if(temp + forwardTime <= finalTime){
                startTime+=forwardTime
                mediaPlayer.seekTo(startTime.toInt())
            }else{
                Toast.makeText(this, "Cannot jump forward", Toast.LENGTH_SHORT).show()
            }
        }

        // rewind btn
        rewindBtn.setOnClickListener {
            var temp = startTime
            if(temp - backwardTime > 0){
                startTime-=backwardTime
                mediaPlayer.seekTo(startTime.toInt())
            }else{
                Toast.makeText(this, "Cannot jump rewind", Toast.LENGTH_SHORT).show()
            }
        }


        titleText.text = resources.getIdentifier("fix_you","raw",packageName).toString()
    }

    private val updateSongTime: Runnable = object : Runnable{
        override fun run() {
            startTime = mediaPlayer.currentPosition.toDouble()

            timeText.text = String.format(
                "%d min, %d sec",
                TimeUnit.MILLISECONDS.toMinutes(
                    startTime.toLong()
                ),
                TimeUnit.MILLISECONDS.toSeconds(
                    startTime.toLong() - TimeUnit.MINUTES.toSeconds(
                        TimeUnit.MILLISECONDS.toMinutes(
                            startTime.toLong()
                        )
                    )
                ),
            )

            seekBar.progress = startTime.toInt()

            handler?.postDelayed(this,100)
        }

    }
}