package FloatingPointDetectorStates

import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import State

class ValidWithPeriodState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string in "0123456789") {
            integerDetector.state = ValidWithPeriodState(integerDetector)
        }else{
            integerDetector.state = InvalidState(integerDetector)
        }
    }
}