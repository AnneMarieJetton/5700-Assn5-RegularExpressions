package FloatingPointDetectorStates

import Detectors.IntegerDetector
import EmailDetectorStates.PartTwoState
import EmailDetectorStates.PeriodState
import IntegerDetectorStates.InvalidState
import IntegerDetectorStates.ValidNumberState
import State

class StartState(integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "123456789") {
            integerDetector.state = ValidStartState(integerDetector)
        }else if (string == "0") {
            integerDetector.state = StartZeroState(integerDetector)
        }else if(string == "."){
            integerDetector.state = PeriodState(integerDetector)
        }else{
            integerDetector.state = InvalidState(integerDetector)
        }
    }
}