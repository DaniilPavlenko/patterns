import java.io.PrintStream

class TestPrinterStream : PrintStream(System.out) {

    private val defaultOut = System.out

    private val bufferedStream = StringBuilder()

    override fun println(x: Any?) {
        super.println(x)
        bufferedStream.append(x)
    }

    fun start() {
        System.setOut(this)
    }

    fun printResults(): String {
        return bufferedStream.toString()
    }

    fun resetToDefaultStream() {
        System.setOut(defaultOut)
    }

    fun clear() {
        bufferedStream.clear()
    }
}