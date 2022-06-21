import Detectors.IntegerDetector

abstract class State (val integerDetector: IntegerDetector){

    abstract val isAccepting: Boolean

    abstract fun consumeInput(string: String)
}