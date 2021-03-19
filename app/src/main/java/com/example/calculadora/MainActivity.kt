package com.example.calculadora

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()

        bt_zero.setOnClickListener{AcrescentarUmaExpressao("0", false)}
        bt_um.setOnClickListener{AcrescentarUmaExpressao("1", false)}
        bt_dois.setOnClickListener{AcrescentarUmaExpressao("2", false)}
        bt_tres.setOnClickListener{AcrescentarUmaExpressao("3", false)}
        bt_quatro.setOnClickListener{AcrescentarUmaExpressao("4", false)}
        bt_cinco.setOnClickListener{AcrescentarUmaExpressao("5", false)}
        bt_seis.setOnClickListener{AcrescentarUmaExpressao("6", false)}
        bt_sete.setOnClickListener{AcrescentarUmaExpressao("7", false)}
        bt_oito.setOnClickListener{AcrescentarUmaExpressao("8", false)}
        bt_nove.setOnClickListener{AcrescentarUmaExpressao("9   ", false)}

//Operadores
        bt_soma.setOnClickListener{AcrescentarUmaExpressao("+",false)}
        bt_subtracao.setOnClickListener { AcrescentarUmaExpressao("-",false) }
        bt_multiplicacao.setOnClickListener { AcrescentarUmaExpressao("*",false) }
        bt_divisao.setOnClickListener { AcrescentarUmaExpressao("/",false) }
        bt_ponto.setOnClickListener { AcrescentarUmaExpressao(". ",false) }

        bt_ponto

        bt_limpar.setOnClickListener {
            txt_expressao.text= ""
            txt_resultado.text= ""
        }
        bt_backspace.setOnClickListener{
            val String = txt_expressao.text.toString()

            if(String.isNotBlank()){
                txt_expressao.text = String.substring(0, String.length-1)
            }
            txt_resultado.text = ""
        }


    }

   private fun AcrescentarUmaExpressao(String: String, limpar_dados : Boolean){
        if (txt_resultado.text.isNotEmpty()){
            txt_expressao.text = ""
        }

        if (limpar_dados){
            txt_resultado.text = ""
        }else{
            txt_expressao.append(txt_resultado.text)
            txt_expressao.append(String)
            txt_resultado.text = ""
        }
    }



    }

