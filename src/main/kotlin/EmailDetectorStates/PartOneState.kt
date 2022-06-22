package EmailDetectorStates

import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import State

class PartOneState(integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == " "){
            integerDetector.state = InvalidState(integerDetector)
        }else if (string == "@"){
            integerDetector.state = AtState(integerDetector)
        }else{
            integerDetector.state = PartOneState(integerDetector)
        }
    }
}