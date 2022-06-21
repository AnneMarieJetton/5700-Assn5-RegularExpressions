import Detectors.IntegerDetector

fun main(args: Array<String>) {
    val detector = IntegerDetector()

    println(detector.detectInt("123"))
    println(detector.detectInt("0123"))
    println(detector.detectInt("123a4"))
    println(detector.detectInt("123977569876964754374657"))
    println(detector.detectInt("1"))
    println(detector.detectInt("0"))
    println(detector.detectInt(""))
}