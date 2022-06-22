package Detectors

import BinaryDetectorStates.BinaryStartState
import Detector
import IntegerDetectorStates.IntegerStartState
import State

class IntegerDetector(): Detector() {

//    override fun detectorType(): String {
//        return "integer"
//    }

    override fun detectorType(): State {
        return IntegerStartState(this)
    }
}