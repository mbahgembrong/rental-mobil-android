package com.salsabilla.rental_mobil.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Pelanggan(
    @SerializedName("id") var id: String,
    @SerializedName("nik") var nik: String,
    @SerializedName("nama") var nama: String,
    @SerializedName("Tanggal_lahir") var tanggalLahir: Date,
    @SerializedName("alamat") var alamat: String,
    @SerializedName("hp") var hp: String,
    @SerializedName("ktp") var ktp: String,
    @SerializedName("email") var email: String,
    @SerializedName("password") var pasword: String?,
    @SerializedName("foto") var foto: String
) : Parcelable