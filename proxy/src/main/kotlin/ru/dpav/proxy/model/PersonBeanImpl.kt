package ru.dpav.proxy.model

class PersonBeanImpl : PersonBean {

    private var userName: String = ""
    private var gender: String = ""
    private var interests: String = ""
    private var rating: Int = 0
    private var ratingCount: Int = 0

    override fun setName(name: String) {
        this.userName = name
    }

    override fun setGender(gender: String) {
        this.gender = gender
    }

    override fun setInterests(interests: String) {
        this.interests = interests
    }

    override fun setRating(rating: Int) {
        this.rating += rating
        ratingCount++
    }

    override fun getName() = userName

    override fun getGender() = gender

    override fun getInterests() = interests

    override fun getRating() = if (ratingCount == 0) 0 else (rating / ratingCount)
}