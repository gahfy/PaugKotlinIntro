package fr.paug.lemonderss

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*
import java.net.URL

class MainActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        async() {
            val result = URL("http://www.gahfy.net/helloworld.txt").readText()
            uiThread {
                toast(result)
            }
        }
    }
}