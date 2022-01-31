package my.project.doctorolegmaiami;



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity

class second_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val imageView: ImageView = findViewById(R.id.imageView19)
        imageView.setOnClickListener {
            openActivity2()
        }
    }
    }

     private fun openActivity2()
     {
        //val intent = Intent(this,third_activity::javaClass )
        // startActivity(intent)
     }
