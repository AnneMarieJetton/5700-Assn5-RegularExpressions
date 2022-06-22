package FloatingPointDetectorStates

import Detectors.IntegerDetector
import EmailDetectorStates.PeriodState
import IntegerDetectorStates.InvalidState
import State

class PeriodState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "0123456789") {
            integerDetector.state = ValidWithPeriodState(integerDetector)
        }else{
            integerDetector.state = InvalidState(integerDetector)
        }
    }
}