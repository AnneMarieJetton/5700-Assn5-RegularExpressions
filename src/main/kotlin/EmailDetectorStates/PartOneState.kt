package EmailDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class PartOneState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == " "){
            detector.state = IntegerInvalidState(detector)
        }else if (string == "@"){
            detector.state = AtState(detector)
        }else{
            detector.state = PartOneState(detector)
        }
    }
}