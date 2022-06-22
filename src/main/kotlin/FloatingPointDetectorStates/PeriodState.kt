package FloatingPointDetectorStates

import Detector
import IntegerDetectorStates.IntegerInvalidState
import State

class PeriodState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "0123456789") {
            detector.state = ValidWithPeriodState(detector)
        }else{
            detector.state = IntegerInvalidState(detector)
        }
    }
}