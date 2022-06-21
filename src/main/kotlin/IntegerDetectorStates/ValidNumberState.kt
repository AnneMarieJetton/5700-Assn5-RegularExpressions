package IntegerDetectorStates

import Detectors.IntegerDetector
import State

class ValidNumberState(integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string !in "0123456789") {
            integerDetector.state = InvalidState(integerDetector)
        }
    }
}