package com.example.sharedpreference

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName:EditText=findViewById(R.id.etUsername)
        val etPass:EditText=findViewById(R.id.etPassword)
        val butLgn:Button=findViewById(R.id.btLgn)
        var intent=Intent(this,MainActivity2::class.java)
        if (PrefUtil.isLogin == true){
            startActivity(intent)
        }
        butLgn.setOnClickListener{
            var nama=etName.text
            var password=etPass.text
            PrefUtil.name= nama.toString()
            PrefUtil.pass= password.toString()
            PrefUtil.isLogin=true
            startActivity(intent)
        }


    }
}