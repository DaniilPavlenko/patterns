package singleton

object ChocolateBoilerKtObject {

    private var isEmpty: Boolean = true
    private var isBoiled: Boolean = false

    fun fill() {
        if (isEmpty) {
            isEmpty = false
            isBoiled = false
        }
    }

    fun drain() {
        if (!isEmpty && isBoiled) {
            isEmpty = true
        }
    }

    fun boil() {
        if (!isEmpty && !isBoiled) {
            isBoiled = true
        }
    }
}