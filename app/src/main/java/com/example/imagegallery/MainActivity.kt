package com.example.imagegallery
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var imgArray: MutableList<Int> = mutableListOf()
    var index = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgArray.add(R.drawable.img1)
        imgArray.add(R.drawable.img2)
        imgArray.add(R.drawable.img3)
        imgArray.add(R.drawable.img4)
        imgArray.add(R.drawable.img5)

        val img = findViewById<ImageView>(R.id.mainImg)
        val right = findViewById<Button>(androidx.coordinatorlayout.R.id.right)

        img.setOnClickListener {
            if (index<imgArray.size-1){
                index++
            }else{
                index = 0
            }
            img.setImageResource(imgArray[index])
            val tag = img.tag.toString()
            Log.d("TAG", tag)
        }

        right.setOnClickListener{
            img.visibility = View.VISIBLE
        }

    }

}