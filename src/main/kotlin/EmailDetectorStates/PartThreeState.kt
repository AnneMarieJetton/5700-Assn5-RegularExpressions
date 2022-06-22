package EmailDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class PartThreeState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string in " @.") {
            detector.state = IntegerInvalidState(detector)
        }else{
            detector.state = PartThreeState(detector)
        }
    }
}