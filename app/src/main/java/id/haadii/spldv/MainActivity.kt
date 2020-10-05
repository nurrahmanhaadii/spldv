package id.haadii.spldv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, PdfActivity::class.java)
        cover?.setOnClickListener {
            intent.putExtra("url", "cover")
            startActivity(intent)
        }
        kunci?.setOnClickListener {
            intent.putExtra("url", "kunci_jawaban")
            startActivity(intent)
        }
        materi?.setOnClickListener {
            intent.putExtra("url", "materi")
            startActivity(intent)
        }
        pendahuluan?.setOnClickListener {
            intent.putExtra("url", "pendahuluan")
            startActivity(intent)
        }
        peta?.setOnClickListener {
            intent.putExtra("url", "peta_konsep")
            startActivity(intent)
        }
        petunjuk?.setOnClickListener {
            intent.putExtra("url", "petunjuk_penggunaan")
            startActivity(intent)
        }
        soal?.setOnClickListener {
            intent.putExtra("url", "soal")
            startActivity(intent)
        }
        tentang?.setOnClickListener {
            intent.putExtra("url", "tentang_penulis")
            startActivity(intent)
        }
    }
}