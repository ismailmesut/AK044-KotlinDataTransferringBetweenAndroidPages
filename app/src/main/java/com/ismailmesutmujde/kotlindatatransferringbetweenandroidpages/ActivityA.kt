package com.ismailmesutmujde.kotlindatatransferringbetweenandroidpages

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlindatatransferringbetweenandroidpages.databinding.ActivityABinding


class ActivityA : AppCompatActivity() {

    private lateinit var bindingA : ActivityABinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingA = ActivityABinding.inflate(layoutInflater)
        val view = bindingA.root
        setContentView(view)

        bindingA.buttonSend.setOnClickListener {

            val person = Persons(99999, "İsmail", 1.98)
            val newIntent = Intent(this@ActivityA, ActivityB::class.java)
            newIntent.putExtra("message","Hello")
            newIntent.putExtra("age", 23)
            newIntent.putExtra("height", 1.78)
            newIntent.putExtra("object", person)
            startActivity(newIntent)
        }

    }
}