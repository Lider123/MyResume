package com.babaetskv.myresume.data.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

/**
 * @author babaetskv on 10.12.19
 */
class University(
    @SerializedName("university_name")
    val universityName: String,

    @SerializedName("year_from")
    val yearFrom: String,

    @SerializedName("year_until")
    val yearUntil: String,

    val description: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(universityName)
        parcel.writeString(yearFrom)
        parcel.writeString(yearUntil)
        parcel.writeString(description)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<University> {

        override fun createFromParcel(parcel: Parcel) = University(parcel)

        override fun newArray(size: Int) = arrayOfNulls<University>(size)
    }
}
