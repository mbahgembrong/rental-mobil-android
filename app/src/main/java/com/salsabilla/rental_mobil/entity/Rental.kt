package com.salsabilla.rental_mobil.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Rental(
    @SerializedName("id") var id: String,
    @SerializedName("pelanggan") var pelanggan: Pelanggan,
    @SerializedName("detail_mobil") var detailMobil: DetailMobil,
    @SerializedName("sopir") var sopir: Sopir?,
    @SerializedName("waktu_peminjaman") var waktuPeminjaman: Int,
    @SerializedName("waktu_mulai") var waktuMulai: Int,
    @SerializedName("waktu_selesai") var waktuSElesai: Int,
    @SerializedName("waktu_denda") var waktuDenda: Int,
    @SerializedName("total") var total: Int,
    @SerializedName("denda") var denda: Int,
    @SerializedName("grand_total") var grandTotal: Int
) : Parcelable