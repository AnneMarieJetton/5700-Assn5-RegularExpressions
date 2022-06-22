package PasswordDetectorStates

import Detectors.IntegerDetector
import FloatingPointDetectorStates.ValidWithPeriodState
import IntegerDetectorStates.InvalidState
import IntegerDetectorStates.ValidNumberState
import State

class StartState(integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "ABCDEFGHIJKLMNOPQRSTUVWXYZ") {
            integerDetector.state = HasCapitalState(integerDetector)
        }else if (string in "!@#$%&*"){
            integerDetector.state = HasSpecialState(integerDetector)
        }else{
            integerDetector.state = CharState(integerDetector)
        }
    }
}