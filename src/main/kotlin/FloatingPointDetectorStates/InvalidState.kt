package FloatingPointDetectorStates

import Detectors.IntegerDetector
import State

class InvalidState(integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        // noop
    }
}