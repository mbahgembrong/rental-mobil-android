package com.salsabilla.rental_mobil.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Mobil(
    @SerializedName("id") var id: String,
    @SerializedName("kategori_id") var kategori_id: String,
    @SerializedName("nama") var nama: String,
    @SerializedName("jenis") var jenis: String,
    @SerializedName("type") var type: String,
    @SerializedName("merk") var merk: String,
    @SerializedName("harga") var harga: Int,
    @SerializedName("satuan") var satuan: String,
    @SerializedName("denda") var denda: Int
) : Parcelable