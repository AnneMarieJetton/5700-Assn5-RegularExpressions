package BinaryDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class OneState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string == "0"){
            detector.state = ZeroState(detector)
        }else if (string == "1"){
            detector.state = OneState(detector)
        } else {
            detector.state = IntegerInvalidState(detector)
        }
    }
}