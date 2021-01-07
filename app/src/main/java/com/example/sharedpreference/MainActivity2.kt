package com.example.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var name1:TextView=findViewById(R.id.vwName)
        var pass1:TextView=findViewById(R.id.vwPass)
        name1.text=PrefUtil.name
        pass1.text=PrefUtil.pass
    }
}