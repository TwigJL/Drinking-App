package com.example.drinkinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EditQuestionSet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_question_set)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}