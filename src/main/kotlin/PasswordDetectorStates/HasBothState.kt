package PasswordDetectorStates

import Detectors.IntegerDetector
import State

class HasBothState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string in "!@#$%&*") {
            integerDetector.state = CurrentSpecialState(integerDetector)
        }else{
            integerDetector.state = HasBothState(integerDetector)
        }
    }
}