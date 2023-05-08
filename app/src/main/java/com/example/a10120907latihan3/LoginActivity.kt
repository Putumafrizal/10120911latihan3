//Nim : 10120911
//Nama : Putu Mafrizal Alif Astika
//Kelas : IF10
//Tanggal : 30 April 2023

package com.example.a10120911latihan3

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val textBodyDetail : TextView = findViewById(R.id.textBodyDetail)
        textBodyDetail.text = Html.fromHtml(getString(R.string.detailBody))
        val buttonMulai : Button = findViewById(R.id.buttonMulai)
        buttonMulai.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonMulai -> {
                val editTextKode = findViewById<EditText>(R.id.editTextKodeKeluarga)
                if(editTextKode.text.isEmpty()){
                    val dialog = Dialog(this)
                    dialog.setContentView(R.layout.activity_warning_dialog)
                    val buttonOke = dialog.findViewById<Button>(R.id.buttonOkeKembali)
                    buttonOke?.setOnClickListener {
                        dialog.dismiss()
                    }
                    dialog.show()
                }else{
                    val moveIntent = Intent( this@LoginActivity, BiodataActivity::class.java)
                    startActivity(moveIntent)
                }
            }
        }
    }

}