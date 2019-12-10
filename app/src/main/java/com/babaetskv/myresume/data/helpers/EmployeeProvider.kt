@file:JvmName("SkillsProvider")
package com.babaetskv.myresume.data.helpers

import com.babaetskv.myresume.data.models.*

/**
 * @author babaetskv on 10.12.19
 */

fun provideEmployee() = Employee(
    firstName = "Konstantin",
    lastName = "Babaets",
    position = "Android developer",
    summary = "Lorem ipsum",
    phone = "",
    email = "",
    skills = provideSkills(),
    education = provideEducation(),
    projects = provideProjects(),
    employment = provideEmployment()
)

fun provideSkills(): List<Skill> {
    val skills = arrayListOf<Skill>()
    skills.add(Skill("Android Development", "https://miro.medium.com/max/256/1*Qto7UMJ5fRaXPU1Pb7tN6g.png", 4.4f))
    skills.add(Skill("Kotlin", "https://hsto.org/webt/5b/2e/6c/5b2e6c6ceab88080424139.png", 4.8f))
    skills.add(Skill("Java", "https://www.securitylab.ru/upload/iblock/833/8334b1c6ac643a5a9f67ca93140c0afd.png", 4.2f))
    return skills
}

fun provideEducation(): List<University> {
    val universities = arrayListOf<University>()
    universities.add(University("South Ural State University", "https://www.susu.ru/", "2013", "2017", "Statistics"))
    universities.add(University("South Ural State University", "https://www.susu.ru/", "2017", "2019", "IT"))
    return universities
}

fun provideProjects(): List<Project> {
    val projects = arrayListOf<Project>()
    projects.add(Project("DesireGallery", "https://github.com/Lider123/mobile_desiregallery"))
    return projects
}

fun provideEmployment(): List<Employment> {
    val employment = arrayListOf<Employment>()
    employment.add(Employment("Kreograf", "https://creograf.ru/", "2016", "2016"))
    employment.add(Employment("Intersvyaz", "https://www.is74.ru/", "2017", "2019"))
    return employment
}
