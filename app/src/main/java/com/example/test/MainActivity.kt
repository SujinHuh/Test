package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//안녕하세요

        //1.화면이 클릭되었다는 것을 알아야한다. (프로그램)
        val image1 = findViewById<ImageView>(R.id.image_1) //view image 가져옴
        image1.setOnClickListener {
            Toast.makeText(this, "1번클릭", Toast.LENGTH_LONG).show()

            //2.화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌
            val intent = Intent(this, BtsActivity01::class.java)
            startActivity(intent)
        }

    //1.화면이 클릭되었다는 것을 알아야한다. (프로그램)
        val image2 = findViewById<ImageView>(R.id.image_2) //view image2 가져옴
        image2.setOnClickListener {
            Toast.makeText(this, "2번클릭", Toast.LENGTH_LONG).show()

            //2.화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌
            val intent = Intent(this, BtsActivity02::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.image_3) //view image2 가져옴
        image3.setOnClickListener {
            Toast.makeText(this, "3번클릭", Toast.LENGTH_LONG).show()

            //2.화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌
            val intent = Intent(this, BtsActivity03::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.image_4) //view image2 가져옴
        image4.setOnClickListener {
            Toast.makeText(this, "4번클릭", Toast.LENGTH_LONG).show()

            //2.화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌
            val intent = Intent(this, BtsActivity04::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.image_5) //view image2 가져옴
        image5.setOnClickListener {
            Toast.makeText(this, "5번클릭", Toast.LENGTH_LONG).show()

            //2.화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌
            val intent = Intent(this, BtsActivity05::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.image_6) //view image2 가져옴
        image6.setOnClickListener {
            Toast.makeText(this, "6번클릭", Toast.LENGTH_LONG).show()

            //2.화면이 클릭되면, 다음 화면으로 넘어가서, 사진을 크게 보여줌
            val intent = Intent(this, BtsActivity06::class.java)
            startActivity(intent)
        }
    }
}