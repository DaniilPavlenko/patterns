package ru.dpav.iterator

interface Iterator<T> {
    fun next(): T
    fun hasNext(): Boolean
}