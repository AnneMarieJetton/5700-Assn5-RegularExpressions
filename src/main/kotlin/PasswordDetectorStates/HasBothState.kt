package PasswordDetectorStates

import Detector
import State

class HasBothState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string in "!@#$%&*") {
            detector.state = CurrentSpecialState(detector)
        }else{
            detector.state = HasBothState(detector)
        }
    }
}