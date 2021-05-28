package ru.dpav.proxy.model

interface PersonBean {
    fun setName(name: String)
    fun setGender(gender: String)
    fun setInterests(interests: String)
    fun setRating(rating: Int)

    fun getName(): String
    fun getGender(): String
    fun getInterests(): String
    fun getRating(): Int
}