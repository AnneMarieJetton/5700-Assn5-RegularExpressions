package IntegerDetectorStates

import Detector
import State

class ValidNumberState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string !in "0123456789") {
            detector.state = IntegerInvalidState(detector)
        }
    }
}