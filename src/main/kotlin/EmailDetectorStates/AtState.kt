package EmailDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class AtState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in ".@ "){
            detector.state = IntegerInvalidState(detector)
        }else{
            detector.state = PartTwoState(detector)
        }
    }
}