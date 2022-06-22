package FloatingPointDetectorStates

import Detector
import EmailDetectorStates.PeriodState
import IntegerDetectorStates.IntegerInvalidState
import State

class FloatingPointStartState(detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "123456789") {
            detector.state = ValidStartState(detector)
        }else if (string == "0") {
            detector.state = StartZeroState(detector)
        }else if(string == "."){
            detector.state = PeriodState(detector)
        }else{
            detector.state = IntegerInvalidState(detector)
        }
    }
}