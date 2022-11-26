package com.example.job20bintang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Siswa>()
    val listnama = arrayOf(
        "NUR IZZA",
        "RISKA ANGGUN ANGGRIANI",
        "SAHRUL LUKMAN HAKIM",
        "SETYA NENG RAHAYU",
        "SITI AGNIA AMALIA",
        "TIARA BINTANG LISWANDA",
        "WAHYU EKA PRASETYO",
        "ZAMROTUN NISWAH",
        "ZULIANA",
        "ADIDNDA WIDIA CHOIRUNNISSA",
        "ANDREAS ADI MINARSO"
    )

    val listnis = arrayOf(
        "3024",
        "3026",
        "3027",
        "3030",
        "3032",
        "3034",
        "3036",
        "3038",
        "3040",
        "2972",
        "2994",
    )
    lateinit var SiswaView: RecyclerView
    lateinit var siswaAdapter: siswaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SiswaView = findViewById(R.id.SiswaView)
        SiswaView.layoutManager = LinearLayoutManager(this)

        for (i in listnama.indices) {
            list.add(Siswa(listnama[i], listnis[i]))
        }

        siswaAdapter = siswaAdapter(list)
        siswaAdapter.notifyDataSetChanged()
        SiswaView.adapter = siswaAdapter
    }
}