package FloatingPointDetectorStates

import Detector
import EmailDetectorStates.PeriodState
import IntegerDetectorStates.IntegerInvalidState
import State

class StartZeroState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string == ".") {
            detector.state = PeriodState(detector)
        }else{
            detector.state = IntegerInvalidState(detector)
        }
    }
}