package com.example.mad_practical_2_21012021004

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG : String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("oncreate method is called!")

    }
    fun showMessage(msg: String){
        Log.i(TAG, msg )
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        val v:ConstraintLayout?=findViewById(R.id.myConstraintLayout)
        if (v != null){
            Snackbar.make(v,msg,Snackbar.LENGTH_SHORT)
        }
    }

    override fun onStart() {
        super.onStart()
        showMessage( "onStart is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy is called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart is called")
    }


}
