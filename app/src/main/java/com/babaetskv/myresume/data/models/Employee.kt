package com.babaetskv.myresume.data.models

/**
 * @author babaetskv on 10.12.19
 */
data class Employee(
    val firstName: String,
    val lastName: String,
    val photoUrl: String,
    val position: String,
    val summary: String,
    val skills: List<Skill>,
    val projects: List<Project>,
    val education: List<University>,
    val employment: List<Employment>,
    val phone: String,
    val email: String
)
