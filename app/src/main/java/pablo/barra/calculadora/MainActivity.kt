package pablo.barra.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var total : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun pressDigit1(view: View){
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 1
    }

    fun pressDigit2(view: View){
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 2
    }

    fun pressDigitSum(view: View){
        var text: TextView = findViewById(R.id.text)
        var text2: TextView = findViewById(R.id.text2)

        total += text2.text.toString().toInt()

        text.text = text.text.toString() + text2.text.toString() + "+"
        text2.text = ""
    }

    fun pressDigitEqual(view: View){
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total += txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "+"
        txt2.text = total.toString()
    }

    fun pressDigitC(view: View){
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total = 0

        txt1.text = ""
        txt2.text = ""
    }

}