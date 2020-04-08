package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i:Int = 0
        // Write your code here

        // Write your code here

        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                var stroka: String = p0.toString()
                if (stroka.contains("question")) {
                    stroka = stroka.replace("question", "answer")
                    editText.setText(stroka)
                    editText.setSelection(stroka!!.length);
                    i++
                }
                if (stroka.contains("request")) {
                    stroka = stroka.toString().replace("request", "response")
                    editText.setText(stroka)
                    editText.setSelection(stroka!!.length);
                    i++
                }
                if (stroka.contains("problem")) {
                    stroka = stroka.toString().replace("problem", "task")
                    editText.setText(stroka)
                    editText.setSelection(stroka!!.length);
                    i++
                }

                 textView.text = "$i"


            }
        })

    }
}
