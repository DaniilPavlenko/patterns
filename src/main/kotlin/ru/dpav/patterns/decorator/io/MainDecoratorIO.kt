package ru.dpav.patterns.decorator.io

import java.io.BufferedInputStream
import java.io.FileInputStream
import java.io.IOException
import java.io.InputStream

object MainDecoratorIO {

    @JvmStatic
    fun main(args: Array<String>) {
        var charByte: Int
        var inStream: InputStream? = null
        try {
            inStream = LowerCaseInputStream(
                BufferedInputStream(
                    FileInputStream("data/decorator_io_test.txt")
                )
            )
            charByte = inStream.read()
            while (charByte >= 0) {
                print(charByte.toChar())
                charByte = inStream.read()
            }
        } catch (e: IOException) {
            e.printStackTrace()
        } finally {
            inStream?.close()
        }
    }
}