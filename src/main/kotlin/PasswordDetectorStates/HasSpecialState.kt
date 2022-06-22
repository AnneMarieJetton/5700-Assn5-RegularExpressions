package PasswordDetectorStates

import Detectors.IntegerDetector
import State

class HasSpecialState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            integerDetector.state = HasBothState(integerDetector)
        }else{
            integerDetector.state = CharState(integerDetector)
        }
    }
}