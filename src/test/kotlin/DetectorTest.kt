import Detectors.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class DetectorTest {

    @Test
    fun detect() {
        val binaryDetector = BinaryDetector()
        val emailDetector = EmailDetector()
        val floatingPointDetector = FloatingPointDetector()
        val integerDetector = IntegerDetector()
        val passwordDetector = PasswordDetector()

        assertEquals(true, binaryDetector.detect("1"))
        assertEquals(true, binaryDetector.detect("101"))
        assertEquals(true, binaryDetector.detect("10011010001"))
        assertEquals(false, binaryDetector.detect("01"))
        assertEquals(false, binaryDetector.detect("10"))
        assertEquals(false, binaryDetector.detect("100a01"))

        assertEquals(true, emailDetector.detect("a@b.c"))
        assertEquals(true, emailDetector.detect("joseph.ditton@usu.edu"))
        assertEquals(true, emailDetector.detect("{}*$.&$*(@*$%&.*&*"))
        assertEquals(false, emailDetector.detect("@b.c"))
        assertEquals(false, emailDetector.detect("a@b@c.com"))
        assertEquals(false, emailDetector.detect("a b@b.b.c"))

        assertEquals(true, floatingPointDetector.detect("1.0"))
        assertEquals(true, floatingPointDetector.detect("0.2000"))
        assertEquals(true, floatingPointDetector.detect(".123"))
        assertEquals(false, floatingPointDetector.detect("123"))
        assertEquals(false, floatingPointDetector.detect("1.2.3"))
        assertEquals(false, floatingPointDetector.detect("012.4"))

        assertEquals(true, integerDetector.detect("1"))
        assertEquals(true, integerDetector.detect("123"))
        assertEquals(true, integerDetector.detect("3543213654651354"))
        assertEquals(false, integerDetector.detect(""))
        assertEquals(false, integerDetector.detect("0123"))
        assertEquals(false, integerDetector.detect("468u32546"))

        assertEquals(true, passwordDetector.detect("aaaaH!aa"))
        assertEquals(true, passwordDetector.detect("1234567*8J"))
        assertEquals(true, passwordDetector.detect("asdpoihj;loikjasdf;ijp;lij2309jasd;lfkm20ij@aH"))
        assertEquals(false, passwordDetector.detect("a"))
        assertEquals(false, passwordDetector.detect("aaaaaaaaaaa!"))
        assertEquals(false, passwordDetector.detect("Akkkkkkkkkkk!"))

    }
}