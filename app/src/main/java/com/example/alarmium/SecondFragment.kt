package com.example.alarmium

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast

class SecondFragment : Fragment() {

    val cron = view?.findViewById<Chronometer>(R.id.cron)
    val playBtn = view?.findViewById<Button>(R.id.play)
    val pauseBtn = view?.findViewById<Button>(R.id.pause)
    val resetBtn = view?.findViewById<Button>(R.id.reset)
    val splitBtn = view?.findViewById<Button>(R.id.split)
    var runnin: Boolean = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        playBtn?.setOnClickListener() {
            if (!runnin) {
                // cron?.base = SystemClock.elapsedRealtime()
                cron?.start()
                runnin = true
//                Toast.makeText(, "com.example.alarmium", Toast.LENGTH_SHORT).show()
            }
        }

/*
        pauseBtn?.setOnClickListener() {
            if (runnin) {
                cron?.stop()
                runnin = false
            }
        }*/

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    public fun playCron(v: View) {
        if (!runnin) {
            // cron?.base = SystemClock.elapsedRealtime()
            cron?.start()
            runnin = true
        }
    }

    public fun pauseCron(v: View) {
        if (runnin) {
            cron?.stop()
            runnin = false
        }
    }

}

