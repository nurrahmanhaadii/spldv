package id.haadii.spldv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pdf.*
import java.util.*

class PdfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)
        val url = intent.getStringExtra("url")
        toolbar?.title = url!!.capitalize()
        pdf_viewer?.fromAsset(url + ".pdf")?.show()
    }
}