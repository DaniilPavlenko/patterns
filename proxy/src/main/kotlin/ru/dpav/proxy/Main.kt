package ru.dpav.proxy

import ru.dpav.proxy.model.PersonBean
import ru.dpav.proxy.model.PersonBeanImpl
import ru.dpav.proxy.util.ProxyFactory
import java.lang.reflect.UndeclaredThrowableException

object Main {

    private val users = mutableListOf<PersonBean>()

    @JvmStatic
    fun main(@Suppress("UNUSED_PARAMETER") args: Array<String>) {
        initDatabase()

        val person = users.first()

        val ownerProxy = ProxyFactory.getProxy(person, ProxyFactory.Role.OWNER)

        println("My name is ${ownerProxy.getName()}")
        ownerProxy.setInterests("My second life.")
        println("Set my interests: '${ownerProxy.getInterests()}'")

        try {
            ownerProxy.setRating(10)
        } catch (e: UndeclaredThrowableException) {
            println("Oh... sorry, you cannot rate yourself.")
        }
        println("You rating is: ${ownerProxy.getRating()}")

        val nonOwnerProxy = ProxyFactory.getProxy(person, ProxyFactory.Role.NON_OWNER)

        println("User name is ${nonOwnerProxy.getName()}")
        try {
            nonOwnerProxy.setInterests("Water")
        } catch (e: UndeclaredThrowableException) {
            println("Oh... sorry you're not an admin and you cannot set other user interests.")
        }
        nonOwnerProxy.setRating(10)
        println("You successfully increased the user rating.")
        println("${nonOwnerProxy.getName()} rating is ${nonOwnerProxy.getRating()}")
    }

    private fun initDatabase() {
        users += PersonBeanImpl().apply {
            setName("Joe Biden")
            setGender("Magician")
            setInterests("My life.")
        }
    }
}