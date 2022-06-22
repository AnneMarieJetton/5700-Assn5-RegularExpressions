package IntegerDetectorStates

import Detector
import State

class IntegerStartState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "123456789"){
            detector.state = ValidNumberState(detector)
        }else{
            detector.state = IntegerInvalidState(detector)
        }
    }
}