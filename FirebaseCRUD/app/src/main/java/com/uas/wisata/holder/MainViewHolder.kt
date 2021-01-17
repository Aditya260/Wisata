package com.uas.wisata.holder

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.uas.wisata.R

class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    @JvmField
    var namaWisata: TextView

    @JvmField
    var alamatWisata: TextView

    @JvmField
    var hargaTiket: TextView

    @JvmField
    var view: CardView

    init {
        namaWisata = itemView.findViewById(R.id.nama_wisata)
        alamatWisata = itemView.findViewById(R.id.alamat_wisata)
        hargaTiket = itemView.findViewById(R.id.harga_tiket)
        view = itemView.findViewById(R.id.cvMain)
    }
}