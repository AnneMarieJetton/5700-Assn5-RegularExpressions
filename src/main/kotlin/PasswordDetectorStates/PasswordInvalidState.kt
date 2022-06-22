package PasswordDetectorStates

import Detector
import State

class PasswordInvalidState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        // noop
    }
}