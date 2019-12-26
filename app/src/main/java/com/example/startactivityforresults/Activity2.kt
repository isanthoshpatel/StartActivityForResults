package com.example.startactivityforresults

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var i = intent
        var n1 = i.getIntExtra("number1",0)
        var n2 = i.getIntExtra("number2",0)

        tv1_numbers.setText("$n1,$n2")

        bt1_add.setOnClickListener {
            var add = n1 + n2

            var i = Intent()
            i.putExtra("results",add)

            setResult(Activity.RESULT_OK,i)
            finish()
        }

        bt2_sub.setOnClickListener {
            var sub = n1-n2

            var i = Intent()
            i.putExtra("results",sub)

            setResult(Activity.RESULT_OK,i)
            finish()
        }

    }
}
