package PasswordDetectorStates

import Detector
import State

class CharState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            detector.state = HasCapitalState(detector)
        }else if (string in "!@#$%&*"){
            detector.state = HasSpecialState(detector)
        }else{
            detector.state = CharState(detector)
        }
    }
}