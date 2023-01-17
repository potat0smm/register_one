package com.example.test_number_one

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.test_number_one.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

    }
    fun goMy(@Suppress("UNUSED_PARAMETER")view: View) {
            val text = mBinding.etName.text.toString()
            if (text.length > 5) {
                val myGoIntent = Intent(this, SecondActivity::class.java)

                startActivity(myGoIntent)
            }
            else {
                val myGo = Toast.makeText(this,"change", Toast.LENGTH_SHORT)
                myGo.show()
            }
    }
}


