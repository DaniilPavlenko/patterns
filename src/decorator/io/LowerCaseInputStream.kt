package decorator.io

import java.io.FilterInputStream
import java.io.InputStream

class LowerCaseInputStream(inputStream: InputStream) : FilterInputStream(inputStream) {

    override fun read(): Int {
        val c = super.read()
        return if (c == -1) {
            c
        } else {
            c.toChar().toLowerCase().toInt()
        }
    }

    override fun read(b: ByteArray, off: Int, len: Int): Int {
        val result = super.read(b, off, len)
        for (i in off until off + result) {
            b[i] = b[i].toChar().toLowerCase().toByte()
        }
        return result
    }
}