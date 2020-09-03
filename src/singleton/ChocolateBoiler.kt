package singleton

class ChocolateBoiler private constructor() {

    private var isEmpty: Boolean = true
    private var isBoiled: Boolean = false

    companion object {
        @Volatile
        @JvmStatic
        private var instance: ChocolateBoiler? = null

        @JvmStatic
        fun getInstance(): ChocolateBoiler {
            if (instance != null) {
                return instance!!
            }
            synchronized(this) {
                if (instance == null) {
                    instance = ChocolateBoiler()
                }
                return instance!!
            }
        }
    }

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