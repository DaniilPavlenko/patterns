package ru.dpav.patterns.adapter.adapter

import org.junit.jupiter.api.Test
import ru.dpav.patterns.adapter.model.duck.Duck
import ru.dpav.patterns.adapter.model.duck.MallardDuck
import ru.dpav.patterns.adapter.model.turkey.Turkey
import ru.dpav.patterns.adapter.model.turkey.WildTurkey


class TurkeyAdapterTest {
    @Test
    fun firstTest() {
        val duck: Duck = MallardDuck()
        val turkey: Turkey = WildTurkey()

        val turkeyAdapter: Duck = TurkeyAdapter(turkey)

        println("The Turkey says...")
        turkey.gobble()
        turkey.fly()

        println("\nThe Duck says...")
        testDuck(duck)

        println("\nThe TurkeyAdapter says...")
        testDuck(turkeyAdapter)
    }

    private fun testDuck(duck: Duck) {
        duck.quack()
        duck.fly()
    }

}