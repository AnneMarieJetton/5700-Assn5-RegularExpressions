package BinaryDetectorStates

import Detectors.BinaryDetector
import Detectors.IntegerDetector
import State

class InvalidState(binaryDetector: BinaryDetector) : State(binaryDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        // noop
    }
}