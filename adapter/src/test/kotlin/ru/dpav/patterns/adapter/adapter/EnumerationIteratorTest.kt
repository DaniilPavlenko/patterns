package ru.dpav.patterns.adapter.adapter

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertFailsWith

class EnumerationIteratorTest {

    private var items = Hashtable<String, String>()

    init {
        items["first"] = "Apple"
        items["second"] = "Banana"
        items["third"] = "Orange"
    }

    @Test
    fun iteration() {
        val adapter = EnumerationIterator(items.elements())
        val enumeration = items.elements()

        for (i in 0..2) {
            assertTrue(
                "One of the sources doesn't have a next element.",
                enumeration.hasMoreElements() && adapter.hasNext()
            )
            val adapterItem = adapter.next()
            val enumerationItem = enumeration.nextElement()
            assertTrue(
                "Items don't equal: adapter = $adapterItem, enumeration = $enumerationItem",
                adapterItem == enumerationItem
            )
        }
        assertFalse(
            "One of the sources has more elements.",
            enumeration.hasMoreElements() || adapter.hasNext()
        )
    }

    @Test
    fun remove() {
        val adapter = EnumerationIterator(items.elements())
        assertFailsWith(
            UnsupportedOperationException::class,
            "EnumerationIterator doesn't throw an exception on a 'remove' action."
        ) {
            adapter.remove()
        }
    }
}