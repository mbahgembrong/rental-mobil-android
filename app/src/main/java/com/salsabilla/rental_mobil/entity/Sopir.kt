package com.salsabilla.rental_mobil.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sopir(
    @SerializedName("id") var id: String,
    @SerializedName("nik") var nik: String,
    @SerializedName("nomor_sim") var nomorSim: String,
    @SerializedName("tanggal_lahir") var tanggalLahir: String,
    @SerializedName("alamat") var alamat: String,
    @SerializedName("hp") var hp: String,
    @SerializedName("ktp") var ktp: String,
    @SerializedName("email") var email: String,
    @SerializedName("password") var password: String?,
    @SerializedName("foto") var foto: String
) : Parcelable