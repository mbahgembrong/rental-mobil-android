package com.salsabilla.rental_mobil.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    @SerializedName("id") var id: String,
    @SerializedName("nama") var nama: String,
    @SerializedName("email") var email: String,
    @SerializedName("password") var password: String?,
    @SerializedName("jenis_kelamin") var jenisKelamin: String?,
    @SerializedName("alamat") var alamat: String
) : Parcelable