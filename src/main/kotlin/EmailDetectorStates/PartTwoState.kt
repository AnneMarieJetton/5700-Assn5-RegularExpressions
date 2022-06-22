package EmailDetectorStates

import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import State

class PartTwoState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in " @") {
            integerDetector.state = InvalidState(integerDetector)
        }else if (string == "."){
            integerDetector.state = PeriodState(integerDetector)
        }else{
            integerDetector.state = PartTwoState(integerDetector)
        }
    }
}