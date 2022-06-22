package FloatingPointDetectorStates

import Detectors.IntegerDetector
import EmailDetectorStates.PeriodState
import IntegerDetectorStates.InvalidState
import State

class StartZeroState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == ".") {
            integerDetector.state = PeriodState(integerDetector)
        }else{
            integerDetector.state = InvalidState(integerDetector)
        }
    }
}