package my.project.doctorolegmaiami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView: ImageView = findViewById(R.id.imageView3)
        imageView.setOnClickListener{
            val intent = Intent(this,second_activity:: class.java)
            startActivity(intent)
        }
        val imageView2 : ImageView = findViewById(R.id.imageView2)
        imageView2.setOnClickListener {
            val intent = Intent(this,third_activity:: class.java)
            startActivity(intent)
        }

    }






}