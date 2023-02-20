package com.salsabilla.rental_mobil.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DetailMobil (
    @SerializedName("id") var id:String,
    @SerializedName("plat") var plat:String,
    @SerializedName("stnk") var stnk:String,
    @SerializedName("tahun_mobil") var tahunMobil:String,
    @SerializedName("status") var status:String
):Parcelable