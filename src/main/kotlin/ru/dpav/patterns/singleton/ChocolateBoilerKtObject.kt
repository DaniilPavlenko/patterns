package ru.dpav.patterns.singleton

object ChocolateBoilerKtObject {

    private var isEmpty: Boolean = true
    private var isBoiled: Boolean = false

    fun fill() {
        if (isEmpty) {
            isEmpty = false
            isBoiled = false
        }
    }

    @Suppress("unused")
    fun drain() {
        if (!isEmpty && isBoiled) {
            isEmpty = true
        }
    }

    @Suppress("unused")
    fun boil() {
        if (!isEmpty && !isBoiled) {
            isBoiled = true
        }
    }
}