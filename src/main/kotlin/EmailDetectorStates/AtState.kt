package EmailDetectorStates

import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import State

class AtState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in ".@ "){
            integerDetector.state = InvalidState(integerDetector)
        }else{
            integerDetector.state = PartTwoState(integerDetector)
        }
    }
}