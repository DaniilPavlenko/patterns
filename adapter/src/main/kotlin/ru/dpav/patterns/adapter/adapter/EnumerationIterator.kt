package ru.dpav.patterns.adapter.adapter

import java.util.*

class EnumerationIterator<T>(var enum: Enumeration<T>) : MutableIterator<T> {

    override fun hasNext() = enum.hasMoreElements()

    override fun next(): T = enum.nextElement()

    override fun remove() = throw UnsupportedOperationException()
}