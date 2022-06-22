package PasswordDetectorStates

import Detector
import State

class HasSpecialState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            detector.state = HasBothState(detector)
        }else{
            detector.state = HasSpecialState(detector)
        }
    }
}