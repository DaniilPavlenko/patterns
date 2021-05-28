package ru.dpav.proxy.invokationhandler

import ru.dpav.proxy.model.PersonBean
import java.lang.reflect.InvocationHandler
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method

class NonOwnerInvocationHandler(
    private val person: PersonBean
) : InvocationHandler {

    override fun invoke(proxy: Any?, method: Method, args: Array<out Any>?): Any? {
        try {
            when {
                method.name.startsWith("get") -> return method.invoke(person, *args.orEmpty())
                method.name == "setRating" -> return method.invoke(person, *args.orEmpty())
                method.name.startsWith("set") -> throw IllegalAccessException()
            }
        } catch (e: InvocationTargetException) {
            e.printStackTrace()
        }
        return null
    }
}