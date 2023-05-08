//Nim : 10120911
//Nama : Putu Mafrizal Alif Astika
//Kelas : IF10
//Tanggal : 30 April 2023

package com.example.a10120911latihan3

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class BiodataActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        val buttonSelanjutnya : Button = findViewById(R.id.buttonSelanjutnya)
        buttonSelanjutnya.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonSelanjutnya -> {
                val editTextNama = findViewById<EditText>(R.id.editTextNama)
                if (editTextNama.text.isEmpty()){
                    val dialog = Dialog(this)
                    dialog.setContentView(R.layout.activity_warning_dialog_bio)
                    val buttonOke = dialog.findViewById<Button>(R.id.buttonOkeKembali)
                    buttonOke?.setOnClickListener {
                        dialog.dismiss()
                    }
                    dialog.show()
                }else{
                    val editTextNama = findViewById<EditText>(R.id.editTextNama)
                    val moveIntent = Intent(this@BiodataActivity, DoneActivity::class.java)
                    moveIntent.putExtra("username", editTextNama.text.toString())
                    startActivity(moveIntent)
                }
            }
        }
    }
}