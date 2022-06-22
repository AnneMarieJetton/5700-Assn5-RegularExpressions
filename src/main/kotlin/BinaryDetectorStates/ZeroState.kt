package BinaryDetectorStates

import Detectors.BinaryDetector
import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import State

class ZeroState(binaryDetector: BinaryDetector) : State(binaryDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == "0"){
            binaryDetector.state = ZeroState(binaryDetector)
        }else if (string == "1"){
            binaryDetector.state = OneState(binaryDetector)
        } else {
            binaryDetector.state = InvalidState(binaryDetector)
        }
    }
}