package BinaryDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class BinaryStartState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == "1"){
            detector.state = OneState(detector)
        }else{
            detector.state = IntegerInvalidState(detector)
        }
    }
}