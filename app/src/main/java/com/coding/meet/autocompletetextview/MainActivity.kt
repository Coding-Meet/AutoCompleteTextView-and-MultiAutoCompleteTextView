package com.coding.meet.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.MultiAutoCompleteTextView
import android.widget.MultiAutoCompleteTextView.CommaTokenizer
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val languageList = arrayListOf(
        "English",
        "Hindi",
        "Japanese",
        "Chinese",
        "Spanish",
        "German",
        "French",
        "Portuguese",
        "Italian",
        "Arabic",
        "Russian",
        "Korean",
        "Indonesian",
        "Catalan"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /// simple Auto Complete TextView
        val simpleAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.simpleAutoCompleteTV)
        simpleAutoCompleteTextView.threshold = 1
        simpleAutoCompleteTextView.setAdapter(
            ArrayAdapter(
                this,
                android.R.layout.simple_dropdown_item_1line,
                languageList
            )
        )
        val simpleAutoCTVBtn = findViewById<Button>(R.id.simpleACTVBtn)
        simpleAutoCTVBtn.setOnClickListener {
            Toast.makeText(
                this,
                simpleAutoCompleteTextView.text.toString(),
                Toast.LENGTH_LONG
            ).show()
        }



        /// Custom TextView Layout with Auto Complete TextView
        val customAutoCompleteTextView = findViewById<AutoCompleteTextView>(R.id.customAutoCompleteTV)
        customAutoCompleteTextView.threshold = 1
        customAutoCompleteTextView.setAdapter(
            ArrayAdapter(
                this,
              R.layout.language_layout,
                R.id.languageTxt,
                languageList
            )
        )
        val customACTVBtn = findViewById<Button>(R.id.customACTVBtn)
        customACTVBtn.setOnClickListener {
            Toast.makeText(
                this,
                customAutoCompleteTextView.text.toString(),
                Toast.LENGTH_LONG
            ).show()
        }

        // simple Multi Auto Complete Text View
        val simpleMultiAutoCompleteTextView = findViewById<MultiAutoCompleteTextView>(R.id.simpleMultiAutoCompleteTextView)
        simpleMultiAutoCompleteTextView.threshold = 1
        simpleMultiAutoCompleteTextView.setAdapter(
            ArrayAdapter(
                this,
                android.R.layout.simple_dropdown_item_1line,
                languageList
            )
        )
        simpleMultiAutoCompleteTextView.setTokenizer(CommaTokenizer())
        val simpleMATVBtn = findViewById<Button>(R.id.simpleMATVBtn)
        simpleMATVBtn.setOnClickListener {
            Toast.makeText(
                this,
                simpleMultiAutoCompleteTextView.text.toString(),
                Toast.LENGTH_LONG
            ).show()
        }


        // Custom TextView layout With Multi Auto Complete TextView
        val customMultiAutoCompleteTextView = findViewById<MultiAutoCompleteTextView>(R.id.customMultiAutoCompleteTextView)
        customMultiAutoCompleteTextView.threshold = 1
        customMultiAutoCompleteTextView.setAdapter(
            ArrayAdapter(
                this,
               R.layout.language_layout,
                R.id.languageTxt,
                languageList
            )
        )
        customMultiAutoCompleteTextView.setTokenizer(CommaTokenizer())
        val customMATVBtn = findViewById<Button>(R.id.customMATVBtn)
        customMATVBtn.setOnClickListener {
            Toast.makeText(
                this,
                customMultiAutoCompleteTextView.text.toString(),
                Toast.LENGTH_LONG
            ).show()
        }

    }
}