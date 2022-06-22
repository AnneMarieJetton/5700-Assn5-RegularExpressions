package EmailDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class PartTwoState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in " @") {
            detector.state = IntegerInvalidState(detector)
        }else if (string == "."){
            detector.state = PeriodState(detector)
        }else{
            detector.state = PartTwoState(detector)
        }
    }
}