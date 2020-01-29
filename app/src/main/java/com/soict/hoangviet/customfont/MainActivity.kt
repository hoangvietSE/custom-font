package com.soict.hoangviet.customfont

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var currentFont: Typeface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        currentFont = tvHello.typeface
        val spicyTypeface = Typeface.createFromAsset(assets, "fonts/spicy_rice.ttf")
        val tradeTypeface = Typeface.createFromAsset(assets, "fonts/trade_winds.ttf")
        btnSwitchFont.setOnClickListener {
            if (currentFont == spicyTypeface) {
                setFont(tradeTypeface)
            } else {
                setFont(spicyTypeface)
            }
        }
    }

    private fun setFont(newFont: Typeface?) {
        newFont?.let {
            tvHello.typeface = it
            currentFont = it
        }
    }
}
