package com.example.bottom_sheet_fragment.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.example.bottom_sheet_fragment.R
import com.example.bottom_sheet_fragment.fragments.BottomSheetFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews(){
        val button = findViewById<AppCompatButton>(R.id.btm_frag)
        button.setOnClickListener {
            val frag = BottomSheetFragment()
            frag.show(supportFragmentManager, "AndroidCenter")
        }
    }
}