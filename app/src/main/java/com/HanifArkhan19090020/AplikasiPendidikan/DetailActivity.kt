package com.HanifArkhan19090020.AplikasiPendidikan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.HanifArkhan19090020.AplikasiPendidikan.R
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Detail Sekolah Kedinasan"
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.stan))
        textViewnamaDetail.text = intent.getStringExtra("nama")
        textViewlokasiDetail.text = intent.getStringExtra("lokasi")
        textViewKetDetail.text = intent.getStringExtra("keterangan")

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}