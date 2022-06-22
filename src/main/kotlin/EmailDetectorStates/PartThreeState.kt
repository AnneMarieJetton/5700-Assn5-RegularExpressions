package EmailDetectorStates

import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import State

class PartThreeState (integerDetector: IntegerDetector) : State(integerDetector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string in " @.") {
            integerDetector.state = InvalidState(integerDetector)
        }else{
            integerDetector.state = PartThreeState(integerDetector)
        }
    }
}