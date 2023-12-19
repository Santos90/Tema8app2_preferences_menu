package com.example.tema8app2_preferences_menu

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.preference.PreferenceManager
import com.example.tema8app2_preferences_menu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnPreferencias.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        binding.btnMostrarPreferencias.setOnClickListener {
            val pref: SharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(this@MainActivity)
            Log.i("Tema8App2", "Reproducir música: "
                    + pref.getBoolean("reproducirMusica", false));
            Log.i("Tema8App2", "Nick: " + pref.getString("nick", ""));
            Log.i("Tema8App2", "Pais: " + pref.getString("pais", ""));

        }
    }
}