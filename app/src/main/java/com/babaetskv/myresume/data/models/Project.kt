package com.babaetskv.myresume.data.models

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

/**
 * @author babaetskv on 10.12.19
 */
data class Project(
    @SerializedName("project_name")
    val projectName: String,

    val description: String,

    @SerializedName("project_url")
    val projectUrl: String,

    @SerializedName("image_url")
    val imageUrl: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(projectName)
        parcel.writeString(description)
        parcel.writeString(projectUrl)
        parcel.writeString(imageUrl)
    }

    override fun describeContents() = 0

    companion object CREATOR : Parcelable.Creator<Project> {

        override fun createFromParcel(parcel: Parcel) = Project(parcel)

        override fun newArray(size: Int) = arrayOfNulls<Project?>(size)
    }
}
