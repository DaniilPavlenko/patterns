package ru.dpav.proxy.util

import ru.dpav.proxy.invokationhandler.NonOwnerInvocationHandler
import ru.dpav.proxy.invokationhandler.OwnerInvocationHandler
import ru.dpav.proxy.model.PersonBean
import ru.dpav.proxy.util.ProxyFactory.Role.NON_OWNER
import ru.dpav.proxy.util.ProxyFactory.Role.OWNER
import java.lang.reflect.Proxy

class ProxyFactory {

    enum class Role {
        OWNER, NON_OWNER
    }

    companion object {
        fun getProxy(person: PersonBean, role: Role): PersonBean {
            val handler = when (role) {
                OWNER -> OwnerInvocationHandler(person)
                NON_OWNER -> NonOwnerInvocationHandler(person)
            }
            return Proxy.newProxyInstance(
                person.javaClass.classLoader,
                person.javaClass.interfaces,
                handler
            ) as PersonBean
        }
    }
}