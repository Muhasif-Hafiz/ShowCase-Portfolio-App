package com.muhasib.portfolio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    lateinit var BtnAchievement: Button
    lateinit var BtnprofessionalDescription: Button
    lateinit var BtnCertifications: Button
    lateinit var BtnPublications: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnAchievement = findViewById(R.id.Achievement)
        BtnprofessionalDescription = findViewById(R.id.professionalDescription1)
        BtnCertifications = findViewById(R.id.BtnCertifications)
        BtnPublications = findViewById(R.id.BtnPublications)

        BtnAchievement.setOnClickListener {

            val intent = Intent(this@MainActivity, AchievementActivity::class.java)
            startActivity(intent)
        }
        BtnprofessionalDescription.setOnClickListener {


            val intent = Intent(this@MainActivity, ProfessionalActivity::class.java)
            startActivity(intent)
        }

        BtnCertifications.setOnClickListener {

            Toast.makeText(this@MainActivity, "No Certifications inside ", Toast.LENGTH_SHORT)
                .show()

        }

        BtnPublications.setOnClickListener {
            Toast.makeText(this@MainActivity,"End of Publications",Toast.LENGTH_LONG).show()


        }


    }


}