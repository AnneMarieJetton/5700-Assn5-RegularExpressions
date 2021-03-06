package FloatingPointDetectorStates

import Detector
import EmailDetectorStates.PeriodState
import IntegerDetectorStates.IntegerInvalidState
import State

class ValidStartState (detector: Detector) : State(detector) {
    override val isAccepting: Boolean
        get() = false

    override fun consumeInput(string: String) {
        if (string in "0123456789") {
            detector.state = ValidStartState(detector)
        }else if(string == "."){
            detector.state = PeriodState(detector)
        }else{
            detector.state = IntegerInvalidState(detector)
        }
    }
}