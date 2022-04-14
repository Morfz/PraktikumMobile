package com.example.konversimatauang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.konversimatauang.databinding.ActivityMainBinding
import java.text.NumberFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.button.setOnClickListener { calculateCurrency() }
    }

    private fun calculateCurrency() {
        val stringInTextField = binding.amountEditText.text.toString()
        val amount = stringInTextField.toDoubleOrNull()

        if (amount == null || amount == 0.0) {
            displayCurrency(0.0)
            return
        }

        val currencyRate = when (binding.options.checkedRadioButtonId) {
            R.id.euro -> 15620.81
            R.id.dollar -> 14366.00
            R.id.yen -> 114.51
            else -> 3831.34
        }

        var rupiah = currencyRate * amount

        displayCurrency(rupiah)
    }

    private fun displayCurrency(rupiah: Double) {
        val indonesianLocale = Locale("in", "ID")
        val formattedCurrency = NumberFormat.getCurrencyInstance(indonesianLocale).format(rupiah)
        binding.result.text = getString(R.string.tip_amount, formattedCurrency)
    }
}