package FloatingPointDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class ValidWithPeriodState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = true

    override fun consumeInput(string: String) {
        if (string in "0123456789") {
            detector.state = ValidWithPeriodState(detector)
        }else{
            detector.state = IntegerInvalidState(detector)
        }
    }
}