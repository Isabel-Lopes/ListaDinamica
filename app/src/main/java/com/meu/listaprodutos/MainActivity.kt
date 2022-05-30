package com.meu.listaprodutos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.meu.listaprodutos.Adapter.AdapterProduto
import com.meu.listaprodutos.model.Produto

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerView_produtos)
        recyclerView_produtos.layoutManager = LinearLayoutManager(this)
        recyclerView_produtos.setHasFixedSize(true)
        //config adapter


        val listaProdutos: MutableList<Produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this, listaProdutos)
        recyclerView_produtos.adapter = adapterProduto

        val produto1 = Produto(
            R.drawable.wig_gabriela,
            "Wig Gabriela Close",
            "Half Wig, Não tem Pentes Internos, Contém Alça Reguladora, Sem Brilho Artificial, 40 cm,  Cor preto Cacheado, Fibra Orgânica",
            "R$ 420,00"
        )
         listaProdutos.add(produto1)

        val produto2 = Produto(
            R.drawable.wig_life,
            "Wig Life Glamour",
            "Fibra Futura, Alça Reguladora, 27 cm, Cor Roxo Liso versátil, Perfeito para Causar",
            "R$ 390,00"
        )
        listaProdutos.add(produto2)
        val produto3 = Produto(
            R.drawable.wig_carine,
            "Wig Carine Charme",
            "Orgânica Premium, Aparência de Cabelo Natural, Alça Reguladora, 64 cm, Toda Lisa , 3 pentes internos",
            "R$ 470,00"
        )
        listaProdutos.add(produto3)
        val produto4 = Produto(
            R.drawable.wig_lifestyle,
            "Wig Lifestyle",
            "Fibra Futura, Aparência de Cabelo Natural, Alça Reguladora, 55 cm, 3 pentes internos, Usar e Abusar no Dia a Dia",
            "R$ 550,00"
        )
        listaProdutos.add(produto4)


        }
    }
