package EmailDetectorStates

import Detector
import State

class EmailInvalidState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        // noop
    }
}