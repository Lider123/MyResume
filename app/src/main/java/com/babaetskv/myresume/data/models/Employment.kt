package com.babaetskv.myresume.data.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

/**
 * @author babaetskv on 10.12.19
 */
data class Employment(
    @SerializedName("company_name")
    val companyName: String,

    @SerializedName("company_site")
    val companySite: String,

    val description: String,

    @SerializedName("year_from")
    val yearFrom: String,

    @SerializedName("year_until")
    val yearUntil: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(companyName)
        parcel.writeString(companySite)
        parcel.writeString(description)
        parcel.writeString(yearFrom)
        parcel.writeString(yearUntil)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Employment> {
        override fun createFromParcel(parcel: Parcel) = Employment(parcel)

        override fun newArray(size: Int) = arrayOfNulls<Employment?>(size)
    }
}
