package com.project.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view: View) {
        when (view) {
            box_one_text -> box_one_text.setBackgroundColor(Color.DKGRAY)
            box_two_image -> box_two_image.setBackgroundResource(R.drawable.ic_test_foreground)
            box_three_text -> box_three_text.setBackgroundColor(Color.BLUE)
            box_four_text -> box_four_text.setBackgroundColor(Color.MAGENTA)
            box_five_text -> box_five_text.setBackgroundColor(Color.BLUE)
            red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            green_button -> box_five_text.setBackgroundResource(R.color.my_green)
            else -> constraint_layout.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val clicableViews: List<View> =
            listOf(
                box_one_text,
                box_two_image,
                box_three_text,
                box_four_text,
                box_five_text,
                constraint_layout,
                green_button,
                yellow_button,
                red_button
            )

        for (item in clicableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}