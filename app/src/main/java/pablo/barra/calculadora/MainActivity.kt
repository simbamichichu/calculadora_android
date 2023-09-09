package pablo.barra.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var total: Int = 0
    var operator: Char = '+'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun pressDigit0(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 0
    }

    fun pressDigit1(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 1
    }

    fun pressDigit2(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 2
    }

    fun pressDigit3(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 3
    }

    fun pressDigit4(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 4
    }

    fun pressDigit5(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 5
    }

    fun pressDigit6(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 6
    }

    fun pressDigit7(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 7
    }

    fun pressDigit8(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 8
    }

    fun pressDigit9(view: View) {
        var txt2: TextView = findViewById(R.id.text2)
        txt2.text = txt2.text.toString() + 9
    }

    fun pressDigitSum(view: View) {
        var text: TextView = findViewById(R.id.text)
        var text2: TextView = findViewById(R.id.text2)

        total += text2.text.toString().toInt()

        text.text = text.text.toString() + text2.text.toString() + "+"
        text2.text = ""
    }
    fun pressDigitEqual(view: View) {
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        val operand2 = txt2.text.toString().toInt()

        when (operator) {
            '+' -> total += operand2
            '-' -> total -= operand2
            '*' -> total *= operand2
            '%' -> total %= operand2

        }
        txt1.text = txt1.text.toString() + txt2.text.toString() + "="
        txt2.text = total.toString()
    }

    fun pressDigitC(view: View) {
        var txt: TextView = findViewById(R.id.text)
        var text2: TextView = findViewById(R.id.text2)

        total = 0

        txt.text = ""
        text2.text = ""
    }

    fun pressDigitpunto(view: View) {
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total = txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "*"
        txt2.text = ""
    }

    fun pressDigitmenos(view: View) {
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total -= txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "-"
        txt2.text = ""
    }

    fun pressDigitPorcentajes(view: View) {
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total %= txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "%"
        txt2.text = ""
    }

    fun pressDigitParentesis(view: View) {
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total = txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "( )"
        txt2.text = ""
    }

    fun pressDigitdivicion(view: View) {
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total /= txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "/"
        txt2.text = ""

    }

    fun pressDigitPor(view: View) {
        var txt1: TextView = findViewById(R.id.text)
        var txt2: TextView = findViewById(R.id.text2)

        total *= txt2.text.toString().toInt()

        txt1.text = txt1.text.toString() + txt2.text.toString() + "*"
        txt2.text = ""

    }
}


