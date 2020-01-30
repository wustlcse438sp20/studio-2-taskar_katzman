package com.example.studio2

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    enum class RequestInt(code: Int) {
        CHANGE_BALANCE(1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun changeBalance(view: View){
        val changeBalIntent = Intent(this, ChangeActivity::class.java)

        var requestInt = RequestInt.CHANGE_BALANCE.ordinal

        startActivityForResult(changeBalIntent, requestInt)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == RequestInt.CHANGE_BALANCE.ordinal){
            if(resultCode == Activity.RESULT_OK){
                Log.d("DEBUG", "This works")
            }
        }
    }

}
