package EmailDetectorStates

import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import IntegerDetectorStates.ValidNumberState
import State

class StartState(integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {

    }
}