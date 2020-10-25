package com.example.playstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val arrayList=ArrayList<Apps>()

        arrayList.add(Apps("Facebook","4.6 ★",R.drawable.facebook))
        arrayList.add(Apps("Twitter","4.5 ★",R.drawable.twitter))
        arrayList.add(Apps("Instagram","4.7 ★",R.drawable.instagram))
        arrayList.add(Apps("WhatsApp","4.7 ★",R.drawable.whatsapp))
        arrayList.add(Apps("Messenger","3.9 ★",R.drawable.messenger))
        arrayList.add(Apps("Brawl Stars","4.2 ★",R.drawable.brawlstars))
        arrayList.add(Apps("Clash Royale","4.9 ★",R.drawable.clashroyale))
        arrayList.add(Apps("Netflix","4.0 ★",R.drawable.netflix))
        arrayList.add(Apps("Paypal","4.4 ★",R.drawable.paypal))
        arrayList.add(Apps("Spotify","3.5 ★",R.drawable.spotify))
        arrayList.add(Apps("Tik Tok","3.8 ★",R.drawable.tiktok))
        arrayList.add(Apps("Discord","4.7 ★",R.drawable.discord))

        val appsAdapter=AppsAdapter(arrayList,this)
        rvApps.layoutManager= LinearLayoutManager(this)
        rvApps.adapter=appsAdapter
        rvApps.apply {
            layoutManager = GridLayoutManager(context,3)
        }


    }













}