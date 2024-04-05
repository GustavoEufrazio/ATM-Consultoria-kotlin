package com.gustavoeufrazio.atmconsultoria

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.accessibility.AccessibilityManagerCompat.TouchExplorationStateChangeListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_LONG).show();

        val btn_cliente = findViewById<View>(R.id.btn_clientes);
        val btn_empresa = findViewById<View>(R.id.btn_empresa);
        val btn_contato = findViewById<View>(R.id.btn_contato);
        val btn_servicos = findViewById<View>(R.id.btn_servicos);
        btn_contato.setOnClickListener{

            Toast.makeText(applicationContext, "Contato foi clicado", Toast.LENGTH_LONG).show();
           Toast.makeText(this, "Contato foi clicado", Toast.LENGTH_LONG).show();
            val intent = Intent(this, DetalheContatoActivity::class.java)
            startActivity(intent)
        }
        btn_empresa.setOnClickListener{
            val intent = Intent(this, DetalhesEmpresaActivity::class.java)
            startActivity(intent)
        }
        btn_cliente.setOnClickListener{
            val intent = Intent(this, DetalhesClientesActivity::class.java)
            startActivity(intent)
        }
        btn_servicos.setOnClickListener{
            val intent = Intent(this, DetalhesServicosActivity::class.java)
            startActivity(intent)
        }
        /*Acima utilizamos o findViewbyId para manipularmos o elemento da tela
        * Depois disso, utilizamos um método próprio do elemento, que quando acionado
        * pelo toque do usuarío ativa uma evento. Sendo esse evento a inicialização de uma activity
        * passamos os seguintes parametros: "intent" (intenção) que serve para manipularmos funcoes do andorid
        * depois passamos a activity com o parametro de sinalizar que é uma classe JAVA
        * */
    }
    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart", Toast.LENGTH_LONG).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume", Toast.LENGTH_LONG).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause", Toast.LENGTH_LONG).show();
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop", Toast.LENGTH_LONG).show();
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_LONG).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_LONG).show();
    }
}