package com.zebrano.studgrades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    // Grade values
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameArray = resources.getStringArray(R.array.names)
        for(i in gradeArray.indices){
            when(gradeArray[i]){
                in bad -> badArray.add("Плохие оценки: ${nameArray[i]} - ${gradeArray[i]}")
                in normal -> normalArray.add("Нормальные оценки: ${nameArray[i]} - ${gradeArray[i]}")
                in nice -> niceArray.add("Хорошие оценки: ${nameArray[i]} - ${gradeArray[i]}")
                excellent -> excellentArray.add("Отличные оценки: ${nameArray[i]} - ${gradeArray[i]}")
            }
        }
        for (chunk in badArray){
            Log.d("AppLog", chunk)
        }
        for (chunk in normalArray) {
            Log.d("AppLog", chunk)
        }
        for (chunk in niceArray){
            Log.d("AppLog", chunk)
        }
        for (chunk in excellentArray){
            Log.d("AppLog", chunk)
        }
    }
}