package com.babaetskv.myresume.data.models

import com.google.gson.annotations.SerializedName

/**
 * @author babaetskv on 10.12.19
 */
data class Employee(
    @SerializedName("first_name")
    val firstName: String,

    @SerializedName("last_name")
    val lastName: String,

    @SerializedName("photo_url")
    val photoUrl: String,

    val birthday: String,
    val presence: String,
    val position: String,
    val summary: String,
    val skills: List<Skill>,
    val projects: List<Project>,
    val education: List<University>,
    val employment: List<Employment>,
    val phone: String,
    val email: String
)
