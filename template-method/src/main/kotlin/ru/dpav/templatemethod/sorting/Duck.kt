package ru.dpav.templatemethod.sorting

class Duck(
    private val name: String,
    private val weight: Int
) : Comparable<Duck> {

    override fun compareTo(other: Duck): Int {
        return when {
            this.weight < other.weight -> -1
            this.weight == other.weight -> 0
            else -> 1
        }
    }

    override fun toString() = "$name weighs $weight"
}