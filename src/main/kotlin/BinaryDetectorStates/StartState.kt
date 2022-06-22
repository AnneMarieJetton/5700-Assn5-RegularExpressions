package BinaryDetectorStates

import Detectors.BinaryDetector
import Detectors.IntegerDetector
import IntegerDetectorStates.InvalidState
import IntegerDetectorStates.ValidNumberState
import State

class StartState(binaryDetector: BinaryDetector) : State(binaryDetector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == "1"){
            binaryDetector.state = OneState(binaryDetector)
        }else{
            binaryDetector.state = InvalidState(binaryDetector)
        }
    }
}