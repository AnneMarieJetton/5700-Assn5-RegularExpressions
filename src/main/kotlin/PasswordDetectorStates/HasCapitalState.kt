package PasswordDetectorStates

import Detectors.IntegerDetector
import State

class HasCapitalState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "!@#$%&*") {
            integerDetector.state = CurrentSpecialState(integerDetector)
        }else{
            integerDetector.state = CharState(integerDetector)
        }
    }
}