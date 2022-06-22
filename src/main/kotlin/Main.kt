fun main(args: Array<String>) {
    val detector = Detector()

    println(detector.detect("123"))
    println(detector.detect("0123"))
    println(detector.detect("123a4"))
    println(detector.detect("123977569876964754374657"))
    println(detector.detect("1"))
    println(detector.detect("0"))
    println(detector.detect(""))
}