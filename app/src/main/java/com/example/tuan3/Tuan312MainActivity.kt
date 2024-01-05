package com.example.tuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Tuan312MainActivity : AppCompatActivity() {
    var adap:Tuan312Adapter?=null
    var ls:ArrayList<Tuan312Contact> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan312_main)
        var lv=findViewById<ListView>(R.id.tuan312lv)
        ls.add(Tuan312Contact("Nguyen Van A","18", com.google.android.material.R.drawable.abc_list_focused_holo))
        ls.add(Tuan312Contact("Nguyen Van B","19", R.drawable.ic_launcher_foreground))
        ls.add(Tuan312Contact("Nguyen Van C","8",  com.google.android.material.R.drawable.abc_text_select_handle_right_mtrl))
        ls.add(Tuan312Contact("Nguyen Van D","17",  androidx.appcompat.R.drawable.abc_ab_share_pack_mtrl_alpha))
        adap= Tuan312Adapter(this,ls)
        lv.adapter=adap
    }
}