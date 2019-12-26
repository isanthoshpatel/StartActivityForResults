package com.example.startactivityforresults

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_openActivity2.setOnClickListener {

            var i = Intent(this, Activity2::class.java)
            i.putExtra("number1", et1_number1.text.toString().toInt())
            i.putExtra("number2", et2_number.text.toString().toInt())

            startActivityForResult(i, 1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK){

                var nubersResults = data?.getIntExtra("results",0)
                tv1_results.setText("$nubersResults")

            }
        }
    }
}
