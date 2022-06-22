package PasswordDetectorStates

import Detector
import State

class HasCapitalState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "!@#$%&*") {
            detector.state = CurrentSpecialState(detector)
        }else{
            detector.state = CharState(detector)
        }
    }
}