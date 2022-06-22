package BinaryDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class ZeroState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

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