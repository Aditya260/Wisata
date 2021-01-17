package com.uas.wisata.model

class ModelWisata {

    var key: String? = null
    var nama: String? = null
    var alamat: String? = null
    var tiket: String? = null

    constructor() {}

    constructor(namaWisata: String?, alamatWisata: String?, harga_tiket: String?) {
        nama = namaWisata
        alamat = alamatWisata
        tiket = harga_tiket
    }
}