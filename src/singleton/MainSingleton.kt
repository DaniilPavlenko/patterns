package singleton

import java.text.DecimalFormat
import kotlin.concurrent.thread
import kotlin.system.measureNanoTime

object MainSingleton {

    @JvmStatic
    fun main(args: Array<String>) {
        testSpeed()
        for (i in 1..10) {
            testUniqueness()
        }
    }

    private fun testSpeed() {
        val decimalFormat = DecimalFormat("###,###.###")

        val firstTimeAccessOwnSingleton = measureNanoTime {
            ChocolateBoiler.getInstance()
        }
        val firstTimeAccessObject = measureNanoTime {
            ChocolateBoilerKtObject
        }

        println("OwnSingleton first access: " + decimalFormat.format(firstTimeAccessOwnSingleton))
        println("Object first access: " + decimalFormat.format(firstTimeAccessObject))

        val timeOfOwnSingleton = measureNanoTime {
            val inst = ChocolateBoiler.getInstance()
            for (i in 0 until 1_000_000_000) {
                inst.fill()
            }
        }
        val timeOfObject = measureNanoTime {
            val inst = ChocolateBoilerKtObject
            for (i in 0 until 1_000_000_000) {
                inst.fill()
            }
        }

        println("OwnSingleton: " + decimalFormat.format(timeOfOwnSingleton))
        println("Object: " + decimalFormat.format(timeOfObject))
    }

    private fun testUniqueness() {
        val setOfObjects = hashSetOf<String>()
        for (i in 0 until 100) {
            thread {
                setOfObjects.add(ChocolateBoiler.getInstance().toString())
            }
        }
        Thread.sleep(1000)
        println("Is there only one singleton: " + (setOfObjects.size == 1))
    }
}