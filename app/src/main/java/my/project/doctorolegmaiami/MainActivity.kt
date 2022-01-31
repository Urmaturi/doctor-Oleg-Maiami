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
            openActivity()
        }

    }

    private fun openActivity()
    {
        val intent = Intent(this,third_activity:: class.java)
        startActivity(intent)
    }


}