package com.babaetskv.myresume.data.models

import android.os.Parcel
import android.os.Parcelable

/**
 * @author babaetskv on 10.12.19
 */
data class Skill(
    val name: String,
    val imageUrl: String,
    val rating: Float
) : Parcelable {

    constructor(parcel: Parcel) : this(parcel.readString()!!, parcel.readString()!!, parcel.readFloat())

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(imageUrl)
        parcel.writeFloat(rating)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Skill> {

        override fun createFromParcel(parcel: Parcel) = Skill(parcel)

        override fun newArray(size: Int) = arrayOfNulls<Skill?>(size)
    }
}
