package com.example.ocenaseekbar

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var reset = findViewById<Button>(R.id.reset)

        var imgtop = findViewById<ImageView>(R.id.img1)
        var imgmid = findViewById<ImageView>(R.id.img2)
        var imgbot = findViewById<ImageView>(R.id.img3)

        var seektop = findViewById<SeekBar>(R.id.sb1)
        var seekmid = findViewById<SeekBar>(R.id.sb2)
        var seekbot = findViewById<SeekBar>(R.id.sb3)

        var progres = findViewById<ProgressBar>(R.id.progress)

        var save = 0
        //-----------------------------------------------------------------------//
        seektop.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //imgtop.layoutParams.width = imgtop.width + (p1 / 4);

                progres.progress = (p1 /3)
               }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                save = progres.progress
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
                save = progres.progress
            }
        })

        //-----------------------------------------------------------------------//
        seekmid.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //imgmid.layoutParams.width += p1 / 2;
                progres.progress = (p1 /3)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                save = progres.progress
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                save = progres.progress
            }
        })

        //-----------------------------------------------------------------------//
        seekbot.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //imgbot.layoutParams.width += p1 / 2;

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }
        })

        reset.setOnClickListener {
            //imgtop.layoutParams.width = 250;
            //imgmid.layoutParams.width = 250;
            //imgbot.layoutParams.width = 250;

            seektop.progress = 0;
            seekmid.progress = 0;
            seekbot.progress = 0;

            progres.progress = 0;

        }
    }
}