package EmailDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class EmailStartState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == "@ "){
            detector.state = IntegerInvalidState(detector)
        }else{
            detector.state = PartOneState(detector)
        }
    }
}