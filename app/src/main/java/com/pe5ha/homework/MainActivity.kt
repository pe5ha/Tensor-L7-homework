package com.pe5ha.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        if(savedInstanceState == null){
//            supportFragmentManager.beginTransaction()
//                .add(R.id.main_activity,AnimatedFragment())
//                .commit()
//        }
        findViewById<Button>(R.id.open_button).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .setCustomAnimations(R.anim.right_in,R.anim.right_out,R.anim.right_in,R.anim.right_out)
                .replace(R.id.main_activity,AnimatedFragment())
                .addToBackStack(null)
                .commit()
            it.visibility = View.GONE // норм ли так делать, или нужно как-то по другому скрывать активити?
        }
    }


    override fun onBackPressed() {
        findViewById<Button>(R.id.open_button).visibility = View.VISIBLE
        super.onBackPressed()
    }
}
