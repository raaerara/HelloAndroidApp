package jp.techacademy.chiaki.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("太郎", 3,"野球")
        val human2 = Human("武田",18,"ボクシング")


        human1.say()
        human1.think()

        human2.say()
        human2.think()


    }
}