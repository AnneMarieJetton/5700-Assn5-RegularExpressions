package IntegerDetectorStates

import Detectors.IntegerDetector
import State

class StartState(integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "123456789"){
            integerDetector.state = ValidNumberState(integerDetector)
        }else{
            integerDetector.state = InvalidState(integerDetector)
        }
    }
}