package com.uas.wisata.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amulyakhare.textdrawable.util.ColorGenerator
import com.uas.wisata.R
import com.uas.wisata.holder.MainViewHolder
import com.uas.wisata.model.ModelWisata
import kotlinx.android.synthetic.main.item_wisata.view.*
import java.util.*

class MainAdapter(private val context: Context,
                  private val daftarWisata: ArrayList<ModelWisata?>?) : RecyclerView.Adapter<MainViewHolder>() {
    private val listener: FirebaseDataListener
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val generator = ColorGenerator.MATERIAL //custom color
        val color = generator.randomColor
        holder.view.setCardBackgroundColor(color)
        holder.namaWisata.text = "Nama   : " + (daftarWisata?.get(position)?.nama)
        holder.alamatWisata.text = "Alamat     : " + daftarWisata?.get(position)?.alamat
        holder.hargaTiket.text = "Harga Tiket   : " + daftarWisata?.get(position)?.tiket
        holder.view.setOnClickListener { listener.onDataClick(daftarWisata?.get(position), position) }
    }

    override fun getItemCount(): Int {

        return daftarWisata?.size!!
    }

    //interface data listener
    interface FirebaseDataListener {
        fun onDataClick(wisata: ModelWisata?, position: Int)
    }

    init {
        listener = context as FirebaseDataListener
    }
}