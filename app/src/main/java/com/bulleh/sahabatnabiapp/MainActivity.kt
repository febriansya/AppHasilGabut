package com.bulleh.sahabatnabiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bulleh.sahabatnabiapp.adapter.GridSahabatAdapter
import com.bulleh.sahabatnabiapp.data.Sahabat
import com.bulleh.sahabatnabiapp.data.SahabatNabi
import com.bulleh.sahabatnabiapp.detail.DetailSahabatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rv_sahabat: RecyclerView

    private var list: ArrayList<Sahabat> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_sahabat = findViewById(R.id.rv_sahabat)
        rv_sahabat.setHasFixedSize(true)

//        menambhakan semua data yang ada di object tanaman obat ke variabel list sesuai dengan posisi indexnya di listdata
        list.addAll(SahabatNabi.listData)
        showRecylerViewGrid()
    }


    private fun showRecylerViewGrid() {
        rv_sahabat.layoutManager = GridLayoutManager(this, 1)
        val gridHeroAdapter = GridSahabatAdapter(list)
        rv_sahabat.adapter = gridHeroAdapter

        gridHeroAdapter.setOnItemClickCallback(object : GridSahabatAdapter.OnItemClickCallBack {
            override fun onItemClicked(data: Sahabat) {
                showDetailData(data)
            }
        })
    }

    private fun showDetailData(sahabat: Sahabat) {
        Toast.makeText(this, "kamu memilih" + sahabat.nama, Toast.LENGTH_SHORT).show()
        val intentwithData = Intent(this@MainActivity,DetailSahabatActivity::class.java)
        intentwithData.putExtra(DetailSahabatActivity.EXTRA_NAME,sahabat.nama)
        intentwithData.putExtra(DetailSahabatActivity.EXTRA_HISTORY,sahabat.history)
        intentwithData.putExtra(DetailSahabatActivity.EXTRA_IMAGE,sahabat.image)
        startActivity(intentwithData)

    }

}